package com.aishang.shop11.service.impl;

import com.aishang.shop11.dao.ProductMapper;
import com.aishang.shop11.po.Product;
import com.aishang.shop11.po.ProductExt;
import com.aishang.shop11.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Saltice
 * @Date: 2021/10/29/15:54
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;
    @Override
    public PageInfo<Product> getAllProducts(ProductExt productExt) {
        //分页插件中设置起始页和页面大小
        PageHelper.startPage(productExt.getPageNow(),8);
        //获取商品结果集（商品列表）
        List<Product> products = productMapper.getAllProducts(productExt);
        //将结果集注入分页插件，设置显示页码数量
        PageInfo<Product> pageInfo = new PageInfo<Product>(products, 7);

        return pageInfo;
    }
}
