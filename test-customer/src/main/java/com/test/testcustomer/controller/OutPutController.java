package com.test.testcustomer.controller;

import com.test.testcustomer.server.OutPutServerFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("out1")
public class OutPutController {
    @Resource
    private OutPutServerFeign outPutServerFeign;

    @RequestMapping("out1")
    public String out(){
        return outPutServerFeign.out();
    }
}
