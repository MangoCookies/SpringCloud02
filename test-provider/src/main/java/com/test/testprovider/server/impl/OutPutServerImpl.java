package com.test.testprovider.server.impl;

import com.test.testprovider.server.OutPutServer;
import org.springframework.stereotype.Service;

@Service
public class OutPutServerImpl implements OutPutServer {
    @Override
    public String out() {
        return "hello!World!1111111111111";
    }
}
