package com.cloud.product.controller;

import com.cloud.product.dao.ProductRepository;
import com.cloud.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.product.controller
 * @author: dd-cat
 * @createTime:2021/4/19 9:44
 * @version:1.0
 */
@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("getProductById")
    public Product getProductById(Integer id) {
        System.out.println("查询：" + id);
        Product one = productRepository.getOne(id);
        System.out.println("商品：" + one);
        return productRepository.getOne(id);

    }

    @PostMapping("saveProduct")
    public void saveProduct() {
        Product p = new Product();
        p.setId(2);
        p.setName("苹果14");
        productRepository.save(p);
        System.out.println("添加成功");
    }
}
