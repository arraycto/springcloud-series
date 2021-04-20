package com.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-product", fallbackFactory = RemoteProductServiceFallback.class)
public interface RemoteProductServiceFeign {

    @GetMapping("getProductById")
    Object getProductById(@RequestParam("id") Integer id);

    @PostMapping("saveProduct")
    void saveProduct();
}
