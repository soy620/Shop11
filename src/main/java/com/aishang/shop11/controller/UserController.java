package com.aishang.shop11.controller;

import com.aishang.shop11.po.User;
import com.aishang.shop11.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
