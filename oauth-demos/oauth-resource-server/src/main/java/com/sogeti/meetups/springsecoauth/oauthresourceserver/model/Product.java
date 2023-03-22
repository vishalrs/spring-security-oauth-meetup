package com.sogeti.meetups.springsecoauth.oauthresourceserver.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Product {
    private int id;
    private String name;
    private int quantity;
}