package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
//    @Autowired
//    private ProductController productController;
//
//    @MockBean
//    private ProductService productService;
//
//    @Test
//    void getSingleProductTest() throws ProductNotFoundException {
//        //Arrange
//        Product expectedProduct = new Product(); // @7891
//        expectedProduct.setTitle("iPhone 15 pro");
//        expectedProduct.setPrice(100000.0);
//        expectedProduct.setDescription("Apple");
//
//        //Mocking
//        when(productService.getSingleProduct(20L))
//                .thenReturn(expectedProduct);
//
//        //Act
//        Product actualProduct = productController.getSingleProduct(20L);
//
//        //Assert
//        assertEquals(expectedProduct, actualProduct);
////        assertEquals(expectedProduct.getPrice(), actualProduct.getPrice());
////        assertEquals(expectedProduct.getTitle(), actualProduct.getTitle());
//    }
//
//    @Test
//    void getAllProductsTest() {
//        Product p1 = new Product(); //@123
//        p1.setTitle("iphone 14 pro");
//        p1.setPrice(100000.0);
//
//        Product p2 = new Product(); // @865
//        p2.setTitle("iphone 15 pro");
//        p2.setPrice(110000.0);
//
//        Product p3 = new Product(); // @654
//        p3.setTitle("iphone 16 pro");
//        p3.setPrice(120000.0);
//
//        List<Product> expectedProducts = new ArrayList<>(); // @9876
//        expectedProducts.add(p1);
//        expectedProducts.add(p2);
//        expectedProducts.add(p3);
//
//        when(productService.getAllProducts())
//                .thenReturn(expectedProducts);
//
//        List<Product> actualProducts = productController.getAllProducts(); // @84657
//
//        assertEquals(expectedProducts.size(), actualProducts.size());
//
//        for (int i = 0; i < expectedProducts.size(); i++) {
//            assertEquals(expectedProducts.get(i).getTitle(),
//                    actualProducts.get(i).getTitle());
//        }
//    }
//
//    @Test
//    void createProduct() {
//    }
//
//    @Test
//    void deleteProduct() {
//    }
//
//    @Test
//    void updateProduct() {
//    }
//
//    @Test
//    void replaceProduct() {
//    }
}

//MockMVC