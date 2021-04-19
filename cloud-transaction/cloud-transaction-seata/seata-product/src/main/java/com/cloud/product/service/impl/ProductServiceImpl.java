package com.cloud.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.product.entity.Product;
import com.cloud.product.mapper.ProductMapper;
import com.cloud.product.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.product.service.impl
 * @author: dd-cat
 * @createTime:2021/4/19 9:43
 * @version:1.0
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
