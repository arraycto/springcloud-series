package com.cloud.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @description:
 * @author: dd-cat
 * @createTime:2021/4/19 9:37
 * @version:1.0
 */
@Data
@Entity
@Table(name = "seata_product")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Product implements Serializable {
    @Id
    private Integer id;
    private String name;
}
