package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.ProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class FakeStoreProductService implements IProductService{

    private final ProductGateway productGateway;
    public FakeStoreProductService(ProductGateway productGateway){
        this.productGateway = productGateway;
    }
    @Override
    public ProductDto getProductById(Long id) throws Exception {
        return this.productGateway.getProductById(id);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws Exception {
        return this.productGateway.createProduct(productDto);
    }
}
