package com.cloud.product.dao;

import com.cloud.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.product.mapper
 * @author: dd-cat
 * @createTime:2021/4/19 9:40
 * @version:1.0
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
