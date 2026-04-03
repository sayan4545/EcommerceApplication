package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.RestTemplateProductgateway;
import org.springframework.stereotype.Service;

@Service
public class RestTemplatePropductService implements RestProductservice{
    private final RestTemplateProductgateway restTemplateProductgateway;

    public RestTemplatePropductService(RestTemplateProductgateway restTemplateProductgateway) {
        this.restTemplateProductgateway = restTemplateProductgateway;
    }

    @Override
    public ProductDto getProductById(Long id) throws Exception {
        return this.restTemplateProductgateway.getProductById(id);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws Exception {
        return this.restTemplateProductgateway.createProduct(productDto);
    }
}
