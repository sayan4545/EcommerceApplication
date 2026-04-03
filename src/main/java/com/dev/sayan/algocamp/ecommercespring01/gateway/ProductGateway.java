package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

import java.io.IOException;

public interface ProductGateway {

    ProductDto getProductById(Long id) throws Exception;
    ProductDto createProduct(ProductDto productDto) throws IOException;
}
