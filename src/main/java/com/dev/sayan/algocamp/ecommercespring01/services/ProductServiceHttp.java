package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

public interface ProductServiceHttp {
    ProductDto getProductById(Long id) throws Exception;
}
