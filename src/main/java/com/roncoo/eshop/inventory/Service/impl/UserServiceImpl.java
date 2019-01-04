package com.roncoo.eshop.inventory.Service.impl;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.roncoo.eshop.inventory.Service.UserService;
import com.roncoo.eshop.inventory.dao.RedisDAO;
import com.roncoo.eshop.inventory.mapper.UserMapper;
import com.roncoo.eshop.inventory.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RedisDAO redisDAO;
    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public User getCachedUserInfo() {
        redisDAO.set("cached_user_lisi","{\"name\": \"lisi\", \"age\":28}");
        String userJSON = redisDAO.get("cached_user_lisi");
        JSONObject jsonObject = JSONObject.parseObject(userJSON);
        User user = new User();
        user.setName(jsonObject.getString("name"));
        user.setAge(jsonObject.getInteger("age"));
        return user;
    }
}
