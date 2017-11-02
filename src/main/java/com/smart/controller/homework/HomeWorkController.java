package com.smart.controller.homework;

import com.smart.service.homework.HomeWorkService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by gaowei on 2017/10/28.
 */
@Controller
@RequestMapping("/homework")
public class HomeWorkController {
    private Logger logger = Logger.getLogger(HomeWorkController.class);

    @Autowired
    private HomeWorkService homeWorkService;

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadHomeWork(@RequestParam(value="file") MultipartFile file) throws Exception {
        //logger.info(file.toString());
        logger.info("truesdsasda");
        return "true";
    }

    @RequestMapping("main")
    public String toMain(){
        return "homework/main";
    }
}
