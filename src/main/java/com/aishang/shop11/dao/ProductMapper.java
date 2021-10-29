package com.aishang.shop11.dao;

import com.aishang.shop11.po.Product;
import com.aishang.shop11.po.ProductExt;
import tk.mybatis.MyMapper;

import java.util.List;

public interface ProductMapper extends MyMapper<Product> {
    List<Product> getAllProducts(ProductExt productExt);
}