package com.example.ribbon2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Date: 2019/10/30
 * Time: 15:22
 *
 * @author wanlongyi
 * @version 1.0
 */
@Component
@FeignClient(value = "ribbon")
public interface RibbonServer {
    @GetMapping("/ribbon/get")
    String get();
}
