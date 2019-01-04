package com.roncoo.eshop.inventory.thread;

import com.roncoo.eshop.inventory.request.Request;
import com.roncoo.eshop.inventory.request.RequestQueue;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  请求处理线程池
 */
public class RequestProcessorThreadPool {
    /**
     * 线程池
     */
    private ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public RequestProcessorThreadPool(){
        RequestQueue requestQueue = RequestQueue.getInstance();
        for (int i = 0; i < 10; i++) {
            ArrayBlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(100);
            requestQueue.addQueue(queue);
            threadPool.submit(new RequestProcessorThread(queue));
        }
    }

    /**
     * 静态内部类的方式去初始化单例
     */
    private static class Singleton{
        private static RequestProcessorThreadPool instance;
        static {
            instance=new RequestProcessorThreadPool();
        }
        public static RequestProcessorThreadPool getInstance(){
            return instance;
        }
    }

    /**
     * 内部类初始化,保证多线程安全
     */
    public static RequestProcessorThreadPool getInstance(){
        return Singleton.getInstance();
    }
    /**
     * 初始化边界方法
     */
    public static void init(){
        getInstance();
    }
}
