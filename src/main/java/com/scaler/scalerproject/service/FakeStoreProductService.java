package com.scaler.scalerproject.service;

import com.scaler.scalerproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        System.out.println("Fetching products from fake store");
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }


}
