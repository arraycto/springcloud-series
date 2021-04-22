package com.cloud.sharding.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: dd-cat
 * @createTime:2021/4/19 17:10
 * @version:1.0
 */
@Data
@Entity
@Table(name = "db_user")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class User {
    @Id
    private Integer id;
    private String name;
}
