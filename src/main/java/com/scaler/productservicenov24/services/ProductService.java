package com.scaler.productservicenov24.services;

import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    Page<Product> getAllProducts(int pageNumber, int pageSize);

    Product createProduct(Product product);

    void deleteProduct(Long productId);

    void updateProduct(Long productId, Product product);

    void replaceProduct(Long productId, Product product);
}
