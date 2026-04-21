package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface DCategoryService {

    List<CategoryDto> getAllCategories();
    CategoryDto createCategory(CategoryDto categoryDto);
    Optional<CategoryDto> getCategoryById(Long categoryId);
}
