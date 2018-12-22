package com.manong.service.impl;

import com.manong.mapper.UserMapper;
import com.manong.pojo.User;
import com.manong.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 22:56 2018/12/22
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserById(Integer userId) {
        return userMapper.queryUserById(userId);
    }
}
