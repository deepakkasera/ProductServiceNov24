package com.scaler.productservicenov24.inheritanceDemo.joinedtable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Instructor extends User {
    private String specialization;
    private double avgRating;
}
