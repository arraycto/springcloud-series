package com.cloud.order.controller;

import com.cloud.order.dao.OrderRepository;
import com.cloud.order.entity.Order;
import com.cloud.order.feign.RemoteProductServiceFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RemoteProductServiceFeign remoteProductServiceFeign;

    @PostMapping("/save")
    @GlobalTransactional
    public void saveOrder(@RequestBody Order order) throws Exception {
        orderRepository.save(order);

        Order byId = orderRepository.getOne(order.getId());
        System.out.println("订单信息：" + byId);

        remoteProductServiceFeign.saveProduct();

        Object productById = remoteProductServiceFeign.getProductById(2);
        System.out.println("商品信息：" + productById);
        throw new Exception("异常");
    }
}
