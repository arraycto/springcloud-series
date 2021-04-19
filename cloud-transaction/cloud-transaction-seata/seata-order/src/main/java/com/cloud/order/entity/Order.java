package com.cloud.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.order.entity
 * @author: dd-cat
 * @createTime:2021/4/16 16:54
 * @version:1.0
 */
@Data
@TableName("seata_order")
public class Order {
    private Integer id;
    private Integer product_id;
    private String name;
}
