package com.manong.controller;

import com.manong.pojo.User;
import com.manong.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 22:55 2018/12/22
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user/{userId}")
    public User queryUserById(@PathVariable Integer userId){
        return userService.queryUserById(userId);
    }

}
