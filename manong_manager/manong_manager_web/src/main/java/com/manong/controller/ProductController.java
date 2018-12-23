package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Hu Yongpeng
 * @Description:商品管理控制层
 * @Date: Created in 14:04 2018/12/23
 */
@Controller
public class ProductController {

    @RequestMapping("product_list")
    public String productList(){
        return "product_list";
    }

}
