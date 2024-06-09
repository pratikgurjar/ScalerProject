package com.scaler.scalerproject;

import com.scaler.scalerproject.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerProjectApplication {

    public static void main(String[] args) {
            Product p = new Product();
            SpringApplication.run(ScalerProjectApplication.class, args);
    }

}
