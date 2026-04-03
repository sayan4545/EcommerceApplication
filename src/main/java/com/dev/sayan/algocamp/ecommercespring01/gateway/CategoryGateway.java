package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface CategoryGateway {

    List<CategoryDto> getAllCategories() throws IOException;
}
