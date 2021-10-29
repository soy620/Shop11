package com.aishang.shop11.po;

/**
 * @Author: Saltice
 * @Date: 2021/10/29/16:05
 * @Description:
 */
public class ProductExt extends Product{
    private Integer pageNow = 1;
    private Integer pageSize = 8;

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
