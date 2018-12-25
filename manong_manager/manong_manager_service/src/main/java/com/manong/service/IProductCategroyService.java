package com.manong.service;

import org.springframework.stereotype.Service;
import pojo.EasyUiTree;

import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 0:34 2018/12/26
 */
public interface IProductCategroyService {

    List<EasyUiTree> findProductCategoryListByParentId(Integer parentId);
}
