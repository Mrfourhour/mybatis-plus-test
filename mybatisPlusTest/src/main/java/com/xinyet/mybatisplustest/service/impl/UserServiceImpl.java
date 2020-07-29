package com.xinyet.mybatisplustest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinyet.mybatisplustest.mapper.UserMapper;
import com.xinyet.mybatisplustest.pojo.User;
import com.xinyet.mybatisplustest.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shengWeiMao
 * @describtion
 * @date 2020/7/29 14:51
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

