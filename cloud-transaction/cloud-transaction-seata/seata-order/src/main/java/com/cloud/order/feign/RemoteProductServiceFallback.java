package com.cloud.order.feign;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.order.feign
 * @author: dd-cat
 * @createTime:2021/4/16 17:06
 * @version:1.0
 */
@Component
public class RemoteProductServiceFallback implements FallbackFactory<RemoteProductServiceFeign> {
    private static final Logger log = LoggerFactory.getLogger(RemoteProductServiceFallback.class);

    @Override
    public RemoteProductServiceFeign create(Throwable throwable) {
        log.error("--------------------系统异常，触发降级: {}", throwable.getMessage());
        return null;
    }
}
