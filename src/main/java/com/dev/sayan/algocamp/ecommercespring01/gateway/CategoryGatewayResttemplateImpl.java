package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreCategoryResponseDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
@Service("restTemplimpl")

public class CategoryGatewayResttemplateImpl implements CategoryGateway{

    private final RestTemplate restTemplate;
    //private final String BASE_URL = "https://fakestoreapi.com";
    private final String BASE_URL = "https://fakestoreapi.com/products/categories";

    public CategoryGatewayResttemplateImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CategoryDto> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDto response = restTemplate
                .getForEntity(BASE_URL,FakeStoreCategoryResponseDto.class).getBody();
        if(response == null) throw new RuntimeException("Nothing exisrts");
        return response.getCategories()
                .stream()
                .map(category-> CategoryDto.builder()
                        .name(category).build()).toList();

    }
}
