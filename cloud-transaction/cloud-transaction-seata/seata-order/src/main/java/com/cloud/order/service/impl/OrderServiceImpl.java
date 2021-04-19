package com.cloud.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.order.entity.Order;
import com.cloud.order.mapper.OrderMapper;
import com.cloud.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.order.service.impl
 * @author: dd-cat
 * @createTime:2021/4/16 16:16
 * @version:1.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
