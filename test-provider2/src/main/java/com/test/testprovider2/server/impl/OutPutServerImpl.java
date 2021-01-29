package com.test.testprovider2.server.impl;

import com.test.testprovider2.server.OutPutServer;
import org.springframework.stereotype.Service;

@Service
public class OutPutServerImpl implements OutPutServer {
    @Override
    public String out() {
        return "hello!World!2222222222";
    }
}
