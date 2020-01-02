package com.example.feign;

import com.example.feign.controller.TokenFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class FeignApplication {
    private static final Logger log = LoggerFactory.getLogger(FeignApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
        log.info(
                "\n----------------------------------------------------------\n\t"
                        + "Application is running! Access URLs:\n\t" + "Local: \t\thttp://127.0.0.1:{}/{}\n\t"
                        + "\n----------------------------------------------------------",
                "","swagger-ui.html");

    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}

