package com.scaler.productservicenov24;

import com.scaler.productservicenov24.models.Category;
import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.repositories.CategoryRepository;
import com.scaler.productservicenov24.repositories.ProductRepository;
import com.scaler.productservicenov24.repositories.projections.ProductWithTitleAndPrice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductServiceNov24ApplicationTests {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Test
//    void contextLoads() {
//    }
//
//    @Test
//    @Transactional
//    void testQuery() {
//        List<ProductWithTitleAndPrice> productsWithTitleAndPrice =
//                productRepository.getTitleAndPriceById();
//
//        for (ProductWithTitleAndPrice productWithTitleAndPrice : productsWithTitleAndPrice) {
//            System.out.println(productWithTitleAndPrice.getTitle());
//            System.out.println(productWithTitleAndPrice.getPrice());
//            System.out.println("-----------");
//        }
//
////        categoryRepository.deleteById(2L);
//
//        //T1
//        Optional<Category> optionalCategory = categoryRepository.findById(1L);
//
//        //T2
////        List<Product> products = optionalCategory.get().getProducts();
//
////        for (Product product : products) {
////            System.out.println(product.getTitle());
////        }
//
//        System.out.println("DEBUG");
//    }
}
