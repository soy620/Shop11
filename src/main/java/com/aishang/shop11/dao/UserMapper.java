package com.aishang.shop11.dao;

import com.aishang.shop11.po.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {
    @Select("select * from user")
    List<User> getAll();
}