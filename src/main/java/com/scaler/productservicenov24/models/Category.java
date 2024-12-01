package com.scaler.productservicenov24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "categories")
public class Category extends BaseModel {
//    @Column(unique = true)
    private String value;

//    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
//    private List<Product> products;

    private String description;
}
