package com.cloud.order.dao;

import com.cloud.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.order.mapper
 * @author: dd-cat
 * @createTime:2021/4/16 17:01
 * @version:1.0
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
