package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/products/1 => Get a single product with id = 1;
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }

    // http://localhost:8080/products => Get all the products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    // http://localhost:8080/products/1
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId) {

    }

    @PatchMapping("/{id}")  //Partial Update
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product) {

    }

    @PutMapping("{id}") // Replace the entire Product object.
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product) {

    }
}
