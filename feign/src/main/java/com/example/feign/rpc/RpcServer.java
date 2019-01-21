package com.example.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jim clark
 * @version 1.0
 */
@FeignClient(value = "ribbon-provider" , fallbackFactory = RpcFallbackFactory.class)
@Component
public interface RpcServer {
    @RequestMapping("ribbon/get")
    public String get();

    @RequestMapping("ribbon/get1")
    public String get1();
}
