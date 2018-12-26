package com.manong.service.impl;

import com.manong.mapper.ProductCategoryMapper;
import com.manong.pojo.ProductCategory;
import com.manong.pojo.ProductCategoryExample;
import com.manong.service.IProductCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUiTree;
import pojo.ResponseJsonResult;
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
        //logger.info("入参===============>"+parentId);
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(productCategoryExample);
        //logger.info("商品栏目集合========>"+productCategories.toString());
        List<EasyUiTree> easyUiTrees = new ArrayList<>(productCategories.size());
        for(ProductCategory productCategory : productCategories){
            EasyUiTree easyUiTree = new EasyUiTree();
            easyUiTree.setId(productCategory.getId());
            easyUiTree.setText(productCategory.getProductCategoryName());
            easyUiTree.setState(productCategory.getParentId() == 0 ? "closed" :"open");
            easyUiTree.setAttributes(productCategory.getParentId()+"");
            easyUiTrees.add(easyUiTree);
        }
        //logger.info("出参=============>"+easyUiTrees.toString());
        return easyUiTrees;
    }

    @Override
    public ResponseJsonResult addProduceCategory(Integer parentId, String name) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setParentId(parentId);
        productCategory.setProductCategoryName(name);

        productCategoryMapper.insertSelective(productCategory);

        ResponseJsonResult responseJsonResult = new ResponseJsonResult();
        responseJsonResult.setMsg(productCategory.getId()+"");
        return responseJsonResult;
    }

    @Override
    public ResponseJsonResult deleteProduceCategory(Integer parentId, Integer id) {
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        if(parentId == 0){
            criteria.andIdEqualTo(id);

            ProductCategoryExample.Criteria criteria1 = productCategoryExample.createCriteria();
            criteria1.andParentIdEqualTo(id);

            productCategoryExample.or(criteria1);
        }else{
            criteria.andIdEqualTo(id);
        }
        productCategoryMapper.deleteByExample(productCategoryExample);
        return new ResponseJsonResult();
    }
}
