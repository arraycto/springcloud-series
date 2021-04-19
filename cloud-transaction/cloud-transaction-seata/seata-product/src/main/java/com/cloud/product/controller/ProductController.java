package com.cloud.product.controller;

import com.cloud.product.entity.Product;
import com.cloud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    ProductService productService;

    @GetMapping("getProductById")
    public Product getProductById(Integer id) {
        return productService.getById(id);

    }

    @GetMapping("saveProduct")
    public void saveProduct() {
        Product p = new Product();
        p.setId(2);
        p.setName("苹果14");
        productService.save(p);

    }
}
