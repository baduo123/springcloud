package com.example.feign.controller;

import com.example.feign.rpc.RpcServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim clark
 * @version 1.0
 */
@RequestMapping("/feign")
@RestController
public class FeignController {

    @Autowired
    RpcServer rpcServer;

    @RequestMapping("get")
    public String get(){
        return rpcServer.get();
    }

    @RequestMapping("get1")
    public String get1(){
        return rpcServer.get1();
    }
}
