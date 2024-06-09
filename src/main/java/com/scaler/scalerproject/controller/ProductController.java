package com.scaler.scalerproject.controller;

import com.scaler.scalerproject.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class ProductController {



//  POST /product
//      Request Body
//      {
//          "title": "Apple airpods",
//          "price": 25080,
//          "description": "Best airpods ever".
//          "image": "https://i.pravatar.cc",
//          "category": "electronic"
//       }

        private ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @PostMapping("/products")
        public String createProduct() {
            // Whenever someone is doing a POST request to /products
            // Plz execute this method
            return "Product added successfully";
        }

        @GetMapping("/products/{id}")
        public String getProduct(@PathVariable("id") Long productId) {
            // Whenever someone is doing a GET request to /products/{id}
            // Plz execute this method
            return "Product fetched successfully";
        }

        @GetMapping("/products")
        public void getProducts() {
            // Whenever someone is doing a GET request to /products
            // Plz execute this method
            productService.getAllProducts();
        }

}
