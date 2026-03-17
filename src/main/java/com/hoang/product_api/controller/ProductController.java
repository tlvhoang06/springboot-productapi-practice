package com.hoang.product_api.controller;

import com.hoang.product_api.model.Product;
import com.hoang.product_api.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productService.getProductByID(id);
    }
}
