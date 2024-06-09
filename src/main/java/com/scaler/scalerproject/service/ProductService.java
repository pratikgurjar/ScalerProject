package com.scaler.scalerproject.service;

import com.scaler.scalerproject.model.Product;
import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
