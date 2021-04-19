package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@MapperScan("com.cloud.product.mapper")
public class SeataProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProductApplication.class, args);
    }
}
