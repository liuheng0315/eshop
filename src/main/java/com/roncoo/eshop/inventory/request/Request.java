package com.roncoo.eshop.inventory.request;

/**
 * 封装一个接口
 */
public interface Request {
    void process();
    Integer getProductId();
    boolean isForceRefresh();
}
