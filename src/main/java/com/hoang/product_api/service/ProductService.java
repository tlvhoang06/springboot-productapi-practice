package com.hoang.product_api.service;

import com.hoang.product_api.model.Product;
import com.hoang.product_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Product getProductByID(Integer id){
        return productRepository.findById(id)
                .orElseThrow(() ->  new RuntimeException("Cannot find product " + id));
    }
    public void updateProduct(Integer id, Product productDetails){
        Product existingProduct = productRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Cannot find product " + id));
        existingProduct.setName(productDetails.getName());
        existingProduct.setPrice(productDetails.getPrice());
        productRepository.save(existingProduct);
    }
    public void deleteProduct(Integer id){
        Product existingProduct = productRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Cannot find product " + id));
        productRepository.delete(existingProduct);
    }
}
