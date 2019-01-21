package com.example.feign.rpc;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author jim clark
 * @version 1.0
 */
@Component
public class RpcFallbackFactory implements FallbackFactory<RpcServer> {
    @Override
    public RpcServer create(Throwable throwable) {
        return new RpcServer() {
            @Override
            public String get() {
                return "fallback1 ";
            }

            @Override
            public String get1() {
                return "get1服务已经关闭";
            }
        };
    }
}
