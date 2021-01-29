package com.test.testprovider.controller;

import com.test.testprovider.server.OutPutServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/out")
public class OutPutController {
    @Autowired
    private OutPutServer outPutServer;

    @PostMapping("/output")
    public String out(){
        String out = outPutServer.out();
        return out;
    }
}
