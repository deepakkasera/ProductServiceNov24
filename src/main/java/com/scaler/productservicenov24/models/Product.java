package com.scaler.productservicenov24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "products")
public class Product extends BaseModel {
    private String title;
    private Double price;
    @ManyToOne
    private Category category;
    private String description;
    private String image;
}


/*
   1              1
Product ------ Category => M:1 => Category id in the Products table.
  M               1
 */