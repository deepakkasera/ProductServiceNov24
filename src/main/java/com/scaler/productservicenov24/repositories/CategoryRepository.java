package com.scaler.productservicenov24.repositories;

import com.scaler.productservicenov24.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
