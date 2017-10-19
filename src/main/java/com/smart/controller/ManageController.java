package com.smart.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by gaowei on 2017/10/20.
 */
@Controller
public class ManageController {

    private Logger logger = Logger.getLogger(ManageController.class);

    @RequestMapping("/manage")
    @ResponseBody
    public String sayHelloToManager(String name) {
        logger.info("say hello:" + name);
        return "hello";
    }
}
