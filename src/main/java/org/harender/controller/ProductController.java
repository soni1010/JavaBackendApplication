package org.harender.controller;

import org.harender.model.Product;
import org.harender.repository.ProductRepository;
import org.harender.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println("Products retrieved from the database: " + products);
        return products;
    }

//    private void printProductToConsole(Product product) {
//        if (product != null) {
//            System.out.println("Product: " + product.getName());
//        } else {
//            System.out.println("Product not found.");
//        }
//    }
    }