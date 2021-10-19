package com.aishang.shop11.service.impl;

import com.aishang.shop11.dao.UserMapper;
import com.aishang.shop11.po.User;
import com.aishang.shop11.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
