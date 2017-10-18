package com.smart.controller;

import com.alibaba.fastjson.JSON;
import com.smart.model.User;
import com.smart.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by gaowei on 2017/10/18.
 */
@Controller
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo() {
        User user = userService.getUserInfo();
        logger.info(user.toString());
        return JSON.toJSONString(user);
        //return user.toString();
    }



}
