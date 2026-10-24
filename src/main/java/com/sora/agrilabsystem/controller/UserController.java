package com.sora.agrilabsystem.controller;

import com.sora.agrilabsystem.entity.User;
import com.sora.agrilabsystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    // 测试 1：往数据库里插一条数据
    @GetMapping("/add")
    public String addUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setRealName("超级管理员");
        user.setRole("ADMIN");
        user.setDepartment("网络中心");
        user.setCreditScore(100);
        user.setStatus(1);

        // 自动生成 INSERT INTO 语句并执行
        userMapper.insert(user);

        return "插入成功！请去 Navicat 看看你的 sys_user 表！";
    }

    // 测试 2：查询所有用户
    @GetMapping("/list")
    public List<User> getUserList() {
        //  SELECT * FROM sys_user
        return userMapper.selectList(null);
    }
}