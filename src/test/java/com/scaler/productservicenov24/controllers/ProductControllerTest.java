package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    @Test
    void getSingleProductTest() throws ProductNotFoundException {
        //Arrange
        Product expectedProduct = new Product();
        expectedProduct.setTitle("iPhone 15 pro");
        expectedProduct.setPrice(100000.0);
        expectedProduct.setDescription("Apple");

        //Mocking
        when(productService.getSingleProduct(20L))
                .thenReturn(expectedProduct);

        //Act
        Product actualProduct = productController.getSingleProduct(20L);

        //Assert
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void getAllProductsTest() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void replaceProduct() {
    }
}