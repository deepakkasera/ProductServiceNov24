package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/products/1 => Get a single product with id = 1;
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) throws ProductNotFoundException {
//        try {
//            return new ResponseEntity<>(
//                    productService.getSingleProduct(productId),
//                    HttpStatus.OK
//            );
//        } catch (ProductNotFoundException e) {
//            return new ResponseEntity<>(
//                    HttpStatus.NOT_FOUND
//            );
//        } catch (RuntimeException e) {
//            return new ResponseEntity<>(
//                    HttpStatus.BAD_REQUEST
//            );
//        }

//        return new ResponseEntity<>(
//                productService.getSingleProduct(productId),
//                HttpStatus.OK
//        );

        System.out.println("Debugging");

        return productService.getSingleProduct(productId);
    }

    // http://localhost:8080/products => Get all the products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
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

//    @ExceptionHandler(ProductNotFoundException.class)
//    private String handleProductNotFoundException() {
//        return "Product not found.";
//    }
}
