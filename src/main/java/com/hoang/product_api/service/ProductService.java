package com.hoang.product_api.service;

import com.hoang.product_api.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Laptop Lenovo", 35000000),
            new Product(2, "Logitech Mouse", 200000),
            new Product(3, "Headphone", 2000000)
    ));
    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> getAllProducts(){
        return products;
    }
}
