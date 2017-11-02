package com.smart.service.homework;

import com.smart.mapper.HomeWorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaowei on 2017/10/28.
 */
@Service
public class HomeWorkService {

    @Autowired
    private HomeWorkMapper homeWorkMapper;


}
