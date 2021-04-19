package com.cloud.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.product.entity
 * @author: dd-cat
 * @createTime:2021/4/19 9:37
 * @version:1.0
 */
@Data
@TableName("seata_product")
public class Product {
    private Integer id;
    private String name;
}
