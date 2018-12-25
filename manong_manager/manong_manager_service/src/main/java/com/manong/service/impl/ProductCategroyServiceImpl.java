package com.manong.service.impl;

import com.manong.mapper.ProductCategoryMapper;
import com.manong.pojo.ProductCategory;
import com.manong.pojo.ProductCategoryExample;
import com.manong.service.IProductCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUiTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 0:36 2018/12/26
 */
@Service
public class ProductCategroyServiceImpl implements IProductCategroyService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<EasyUiTree> findProductCategoryListByParentId(Integer parentId) {
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(productCategoryExample);
        List<EasyUiTree> easyUiTrees = new ArrayList<>(productCategories.size());
        for(ProductCategory productCategory : productCategories){
            EasyUiTree easyUiTree = new EasyUiTree();
            easyUiTree.setId(productCategory.getId());
            easyUiTree.setText(productCategory.getProductCategoryName());
            easyUiTree.setState(productCategory.getParentId() == 0 ? "close" :"open");

            easyUiTrees.add(easyUiTree);
        }
        return easyUiTrees;
    }
}
