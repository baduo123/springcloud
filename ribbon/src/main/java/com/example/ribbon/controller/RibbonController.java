package com.example.ribbon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * @author jim clark
 * @version 1.0
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @GetMapping("get")
    public String get(){

        return "hello ribbon111";
    }
}
