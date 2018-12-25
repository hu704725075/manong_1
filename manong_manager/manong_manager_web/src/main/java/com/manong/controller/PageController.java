package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Hu Yongpeng
 * @Description: 页面控制器
 * @Date: Created in 0:14 2018/12/26
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String satrt(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}
