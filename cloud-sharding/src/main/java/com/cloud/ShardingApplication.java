package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud
 * @author: dd-cat
 * @createTime:2021/4/19 11:28
 * @version:1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.cloud.sharding.mapper")
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }
}
