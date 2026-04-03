package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateProductGatewayImpl implements RestTemplateProductgateway{
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://fakestoreapi.com/products";


    public RestTemplateProductGatewayImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ProductDto getProductById(Long id) throws Exception {
        ResponseEntity<ProductDto> response =
                restTemplate.getForEntity(BASE_URL+"/"+id, ProductDto.class);
        if(response==null) throw new Exception("Product not found with the id");
        return response.getBody();
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws Exception {
        ResponseEntity<ProductDto> response = restTemplate.postForEntity(BASE_URL,productDto, ProductDto.class);
        return response.getBody();
    }
}
