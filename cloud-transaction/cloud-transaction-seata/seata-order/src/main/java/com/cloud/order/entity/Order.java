package com.cloud.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.order.entity
 * @author: dd-cat
 * @createTime:2021/4/16 16:54
 * @version:1.0
 */
@Data
@Entity
@Table(name = "seata_order")
public class Order {
    @Id
    private Integer id;
    private Integer productId;
    private String name;


}
