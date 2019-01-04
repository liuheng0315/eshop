package com.roncoo.eshop.inventory.Service;

import com.roncoo.eshop.inventory.model.User;
/**
 * 用户Service接口
 */
public interface UserService {
    /**
     * 查询用户信息
     */
    public User findUserInfo();
    public User getCachedUserInfo();
}
