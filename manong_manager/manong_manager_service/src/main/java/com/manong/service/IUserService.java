package com.manong.service;

import com.manong.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 22:55 2018/12/22
 */
public interface IUserService {

    User queryUserById(Integer userId);
}
