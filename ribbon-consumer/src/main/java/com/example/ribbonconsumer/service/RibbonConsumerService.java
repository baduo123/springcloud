package com.example.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jim clark
 * @version 1.0
 */
@Service
public class RibbonConsumerService {
    @Autowired
    RestTemplate restTemplate;

    public String get(){
        return restTemplate.getForObject("http://ribbon-provider/ribbon/get",String.class);
    }
}
