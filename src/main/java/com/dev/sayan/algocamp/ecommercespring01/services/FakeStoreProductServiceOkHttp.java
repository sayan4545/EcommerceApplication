package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.OkHttpProdGateway;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductServiceOkHttp implements ProductServiceHttp{

    private final OkHttpProdGateway okHttpProdGateway;
    public FakeStoreProductServiceOkHttp(OkHttpProdGateway okHttpProdGateway){
        this.okHttpProdGateway = okHttpProdGateway;
    }
    @Override
    public ProductDto getProductById(Long id) throws Exception {
        return this.okHttpProdGateway.getProductById(id);
    }
}
