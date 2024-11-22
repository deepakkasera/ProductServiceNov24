package com.scaler.productservicenov24.inheritanceDemo.joinedtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}

/*
1. @Inheritance(strategy = InheritanceType.JOINED)
2. @Entity on all the Models (including Parent class)
3. @PrimaryKeyJoinColumn on every child class model.


 */
