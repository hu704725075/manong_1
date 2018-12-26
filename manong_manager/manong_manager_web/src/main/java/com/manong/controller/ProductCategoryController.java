package com.manong.controller;

import com.manong.service.IProductCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUiTree;
import pojo.ResponseJsonResult;

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

    /**
     * 返回数据列表
     * @param parentId
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUiTree> getProduceCategoryByParentId(@RequestParam(value = "id",defaultValue="0")
                                                                     Integer parentId ){
        List<EasyUiTree> easyUiTrees = productCategroyService.findProductCategoryListByParentId(parentId);
        return easyUiTrees;
    }
    @RequestMapping("/add")
    @ResponseBody
    public ResponseJsonResult addProduceCategory(Integer parentId,String name ){
        ResponseJsonResult responseJsonResult = productCategroyService.addProduceCategory(parentId,name);
        return responseJsonResult;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseJsonResult deleteProduceCategory(Integer parentId,Integer id ){
        ResponseJsonResult responseJsonResult = productCategroyService.deleteProduceCategory(parentId,id);
        return responseJsonResult;
    }
}
