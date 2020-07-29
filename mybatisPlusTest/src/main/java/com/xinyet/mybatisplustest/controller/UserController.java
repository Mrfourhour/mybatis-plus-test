package com.xinyet.mybatisplustest.controller;

import com.xinyet.mybatisplustest.communication.ResultModel;
import com.xinyet.mybatisplustest.pojo.User;
import com.xinyet.mybatisplustest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shengWeiMao
 * @describtion
 * @date 2020/7/29 14:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public ResultModel<List<User>> getAll() {
        List<User> list = userService.list();
        System.out.println("list:" + list);
        return ResultModel.success(list);
    }

    @RequestMapping("/add")
    public ResultModel<List<User>> insert() {
        User user = new User();
        // 不设置id的话，使用数据库自增主键
        user.setName("张飞");
        user.setAge(24);
        user.setAddr("新野");
        boolean save = userService.save(user);
        return getAll();
    }


}

