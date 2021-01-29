package com.test.testprovider3.server.impl;

import com.test.testprovider3.server.OutPutServer;
import org.springframework.stereotype.Service;

@Service
public class OutPutServerImpl implements OutPutServer {
    @Override
    public String out() {
        return "hello!World!3333333333";
    }
}
