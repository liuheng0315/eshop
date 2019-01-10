package com.roncoo.eshop.inventory.controller;

import com.roncoo.eshop.inventory.service.UserService;
import com.roncoo.eshop.inventory.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户的Controller控制层
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = userService.findUserInfo();
        return user;
    }
    @RequestMapping("/getCachedUserInfo")
    @ResponseBody
    public User getCachedUserInfo() {
        User user = userService.getCachedUserInfo();
        return user;
    }
}
