package com.test.testcustomer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "test-provider01")
public interface OutPutServerFeign {

//    @PostMapping("/out/output")
    @PostMapping("/output")
    public String out();
}
