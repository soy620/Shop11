package com.aishang.shop11.controller;

import com.aishang.shop11.po.Product;
import com.aishang.shop11.po.ProductExt;
import com.aishang.shop11.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Saltice
 * @Date: 2021/10/29/15:48
 * @Description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;
    @RequestMapping("/getProducts")
    public PageInfo<Product> getProducts(ProductExt productExt){
        return productService.getAllProducts(productExt);
    }
}
