package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

import java.util.List;

public interface DProductService {
    ProductDto createProduct(ProductDto dto);
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProducts();
}
