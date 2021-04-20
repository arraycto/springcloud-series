package com.cloud.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.entity
 * @author: dd-cat
 * @createTime:2021/4/19 17:10
 * @version:1.0
 */
@Data
@TableName("db_user")
public class User {
    private Integer id;
    private String name;
}
