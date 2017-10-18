package com.smart.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaowei on 2017/10/18.
 */
@Controller
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(value="name") String name) {
        logger.info("heiheihei");
        return "hello! " + name;
    }
}
