package com.scaler.productservicenov24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 Place an order at Amazon :

 origin - Delhi
 Destination - Bangalore

 1. Bangalore
 2. Society Name + pincode
 3. Tower number + Flat Number 602


 Request in Spring -

 http://localhost:8080/sample/hello
 */

@RestController
@RequestMapping("/sample")
public class SampleController {


    // http://localhost:8080/sample/hello/Raja
    @GetMapping("/hello/{name}/{numberOfTimes}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("numberOfTimes") int numberOfTimes) {
        String response = "";
        for (int i = 0; i < numberOfTimes; i++) {
            String s = "Hello " + name + "<br>";
            response += s;
        }

        return response;
    }

    public void sayBye() {

    }
}
