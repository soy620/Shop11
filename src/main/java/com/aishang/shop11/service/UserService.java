package com.aishang.shop11.service;

import com.aishang.shop11.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
