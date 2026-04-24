package com.dev.sayan.algocamp.ecommercespring01.entities;

import jakarta.persistence.*;
import lombok.*;


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
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;
    private String brand;
    private Boolean popular;



}
