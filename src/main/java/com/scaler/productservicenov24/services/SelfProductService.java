package com.scaler.productservicenov24.services;

import com.scaler.productservicenov24.controllers.ProductController;
import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Category;
import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.repositories.CategoryRepository;
import com.scaler.productservicenov24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
//@Primary
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository,
                              CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(productId);


        if (optionalProduct.isEmpty()) {
            throw new ProductNotFoundException("Product with id: " + productId + " not found.");
        }

        return optionalProduct.get();
    }

    @Override
    public Page<Product> getAllProducts(int pageNumber, int pageSize) {
        return productRepository.findAll(
                PageRequest.of(
                        pageNumber,
                        pageSize,
                        Sort.by("price").ascending()
                )
        );

//        productRepository.findAllByTitle(
//                title,
//                PageRequest.of(
//                        pageNumber,
//                        pageSize
//                )
//        );
    }

    @Override
    public Product createProduct(Product product) {
//        if (product.getCategory() != null) {
//            if (product.getCategory().getId() == null) {
//                //Create a Category first.
//                Category category = product.getCategory();
//
//                String categoryValue = category.getValue();
//
//                Optional<Category> optionalCategory = categoryRepository.findByValue(categoryValue);
//
//                if (optionalCategory.isEmpty()) {
//                    category = categoryRepository.save(category);
//                    product.setCategory(category);
//                } else {
//                    product.setCategory(optionalCategory.get());
//                }
//            }
//        } else {
//            throw new RuntimeException("Category can't be empty while creating a Product.");
//        }

        System.out.println("DEBUG");

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public void updateProduct(Long productId, Product product) {

    }

    @Override
    public void replaceProduct(Long productId, Product product) {

    }
}
