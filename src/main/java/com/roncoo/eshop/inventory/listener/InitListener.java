package com.roncoo.eshop.inventory.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 系统初始化监听器
 */
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("============初始化监听器=============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
