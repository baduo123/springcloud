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

    private final RibbonServer ribbonServer;

    public RibbonController(RibbonServer ribbonServer) {
        this.ribbonServer = ribbonServer;
    }

    @GetMapping("get")
    public String get(){
        return "rebbion2222222222";
    }
}
