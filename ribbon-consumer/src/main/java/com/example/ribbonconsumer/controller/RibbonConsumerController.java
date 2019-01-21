package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.RibbonConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim clark
 * @version 1.0
 */
@RequestMapping("/ribbon-consumer")
@RestController
public class RibbonConsumerController {
    @Autowired
    RibbonConsumerService service;

    @GetMapping("get")
    public String get(){
        return service.get();
    }
}
