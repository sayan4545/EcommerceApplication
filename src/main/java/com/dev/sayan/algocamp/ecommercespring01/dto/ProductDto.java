package com.dev.sayan.algocamp.ecommercespring01.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    //public Long id;
    private String image;
    private String colour;
    private Double price;
    private String description;
    private int discount;
    private String model;
    private Long categoryId;
    private String brand;
    private Boolean popular;





}
