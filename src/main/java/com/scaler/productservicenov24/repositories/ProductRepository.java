package com.scaler.productservicenov24.repositories;

import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.repositories.projections.ProductWithTitleAndPrice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long productId);
    //select * from products where id = productId;

    @Override
    Page<Product> findAll(Pageable pageable);
    // select * from products;
    // This query should be paginated.

    Product save(Product product);

    @Query("select p.title as title, p.price as price from products p")
    List<ProductWithTitleAndPrice> getTitleAndPriceById();
}
