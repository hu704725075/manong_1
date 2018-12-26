package com.manong.service;

import pojo.EasyUiTree;
import pojo.ResponseJsonResult;

import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 0:34 2018/12/26
 */
public interface IProductCategroyService {

    List<EasyUiTree> findProductCategoryListByParentId(Integer parentId);

    ResponseJsonResult addProduceCategory(Integer parentId,String name);

    ResponseJsonResult deleteProduceCategory(Integer parentId,Integer id);
}
