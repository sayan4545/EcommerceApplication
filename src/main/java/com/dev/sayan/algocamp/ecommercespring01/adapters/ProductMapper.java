package com.dev.sayan.algocamp.ecommercespring01.adapters;


import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.entities.Product;
import org.springframework.stereotype.Component;


@Component
public class ProductMapper {

    public ProductDto toProductDto(Product product){
        ProductDto dto = ProductDto.builder()
                //.id(product.getId())
                .colour(product.getColour())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .image(product.getImage())
                .model(product.getModel())
                .price(product.getPrice())
                .popular(product.getPopular())
                .category(product.getCategory())
                .brand(product.getBrand())
                .build();
        return dto;
    }

    public Product toProduct(ProductDto dto){
        Product product = Product
                .builder()
                .colour(dto.getColour())
                .description(dto.getDescription())
                .description(dto.getDescription())
                .image(dto.getImage())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .popular(dto.getPopular())
                .category(dto.getCategory())
                .price(dto.getPrice())
                .brand(dto.getBrand())
                .build();
        return product;

    }
}
