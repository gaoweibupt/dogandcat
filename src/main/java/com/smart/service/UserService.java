package com.smart.service;

import com.smart.mapper.UserMapper;
import com.smart.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaowei on 2017/10/18.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        return userMapper.findUser();
    }
}
