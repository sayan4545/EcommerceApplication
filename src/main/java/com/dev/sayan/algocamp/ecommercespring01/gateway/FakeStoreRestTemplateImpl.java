package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreRestTemplateImpl implements CategoryGateway{
    @Override
    public List<CategoryDto> getAllCategories() throws IOException {
        return List.of();
    }
}
