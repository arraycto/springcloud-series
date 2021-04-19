package com.cloud.order.controller;

import com.cloud.order.entity.Order;
import com.cloud.order.feign.RemoteProductServiceFeign;
import com.cloud.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    RemoteProductServiceFeign productServiceFeign;

    @PostMapping("/save")
    @GlobalTransactional
    public void saveOrder(Order order) throws Exception {
        orderService.save(order);

        Order byId = orderService.getById(2);
        System.out.println("订单信息：" + byId);

        productServiceFeign.saveProduct();

        Object productById = productServiceFeign.getProductById(2);
        System.out.println("商品信息：" + productById);
        throw new Exception("异常");
    }
}
