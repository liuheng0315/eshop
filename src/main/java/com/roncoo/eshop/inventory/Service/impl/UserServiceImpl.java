package com.roncoo.eshop.inventory.Service.impl;

import com.roncoo.eshop.inventory.Service.UserService;
import com.roncoo.eshop.inventory.mapper.UserMapper;
import com.roncoo.eshop.inventory.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
}
