package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

public interface RestTemplateProductgateway {

    ProductDto getProductById(Long id) throws Exception;
    ProductDto createProduct(ProductDto productDto) throws Exception;

}
