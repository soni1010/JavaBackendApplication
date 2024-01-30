package org.harender;

import org.harender.model.Product;
import org.harender.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
       // Fetch all products from the database
        Iterable<Product> products = productRepository.findAll();
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName());
        }


        // Save a sample product to the database
        //Product product = new Product();
        //product.setId(88L);
        //product.setName("Sample Product");
        //productRepository.save(product);

    }
}
