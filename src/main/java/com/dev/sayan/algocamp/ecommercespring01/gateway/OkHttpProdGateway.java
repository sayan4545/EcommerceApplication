package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;

public interface OkHttpProdGateway {

    ProductDto getProductById(Long id) throws Exception;
}
