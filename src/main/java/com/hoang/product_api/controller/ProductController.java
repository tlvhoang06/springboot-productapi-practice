package com.hoang.product_api.controller;

import com.hoang.product_api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<Product> getAllProducts(){
        return Arrays.asList(
                new Product(1, "Laptop Lenovo", 35000000),
                new Product(2, "Logitech Mouse", 200000),
                new Product(3, "Headphone", 2000000)
        );
    }
}
