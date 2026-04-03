package com.dev.sayan.algocamp.ecommercespring01.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product extends BaseEntity{

    private String image;
    private String colour;
    private Double price;
    private String description;
    private int discount;
    private String model;
    private String category;
    private String brand;
    private Boolean popular;


}
