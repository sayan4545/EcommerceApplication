package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.CategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final CategoryGateway categoryGateway;

    public FakeStoreCategoryService(@Qualifier("restTemplimpl") CategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }
    @Override
    public List<CategoryDto> getAllcategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
