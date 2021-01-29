package com.test.testprovider2.controller;

import com.test.testprovider2.server.OutPutServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
