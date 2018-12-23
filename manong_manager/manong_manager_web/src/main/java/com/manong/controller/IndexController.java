package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 13:10 2018/12/23
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String indexStart(){
        return "index";
    }
}
