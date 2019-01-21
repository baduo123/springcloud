package com.example.ribbon2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim clark
 * @version 1.0
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @GetMapping("get")
    public String get(){
        return "hello ribbon2";
    }
}
