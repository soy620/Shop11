package com.aishang.shop11.service;

import com.aishang.shop11.po.Product;
import com.aishang.shop11.po.ProductExt;
import com.github.pagehelper.PageInfo;

/**
 * @Author: Saltice
 * @Date: 2021/10/29/15:49
 * @Description:
 */
public interface ProductService {
    /**
     * 获取全部商品
     * @param productExt
     * @return
     */
    public PageInfo<Product> getAllProducts(ProductExt productExt);

}
