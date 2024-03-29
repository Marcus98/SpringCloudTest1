package com.hujun.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client")
public interface HelloService {
    @RequestMapping(value = "/hello")
    String hello();
}