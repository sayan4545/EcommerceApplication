package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

public interface IProductService {

    ProductDto getProductById(Long id) throws Exception;
    ProductDto createProduct(ProductDto productDto) throws Exception;
}
