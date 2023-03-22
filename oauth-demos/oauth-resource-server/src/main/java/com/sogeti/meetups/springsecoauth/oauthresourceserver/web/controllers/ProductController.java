package com.sogeti.meetups.springsecoauth.oauthresourceserver.web.controllers;

import com.sogeti.meetups.springsecoauth.oauthresourceserver.model.Product;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(Authentication authentication) {
        return Arrays.asList(
                new Product[]{new Product(1, "iPhone", 10),
                        new Product(2, "Apple Watch", 12),
                        new Product(3, "MacBook Pro", 15)});
    }
}