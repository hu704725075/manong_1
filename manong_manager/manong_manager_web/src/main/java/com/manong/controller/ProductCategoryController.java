package com.manong.controller;

import com.manong.service.IProductCategroyService;
import com.manong.service.impl.ProductCategroyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUiTree;

import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 0:29 2018/12/26
 */
@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

    @Autowired
    private IProductCategroyService productCategroyService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUiTree> getProduceCategoryByParentId(@RequestParam(value = "Id",defaultValue="0")
                                                                     Integer parentId ){
        return productCategroyService.findProductCategoryListByParentId(parentId);
    }
}
