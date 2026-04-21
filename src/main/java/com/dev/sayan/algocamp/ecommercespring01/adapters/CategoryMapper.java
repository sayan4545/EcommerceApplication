package com.dev.sayan.algocamp.ecommercespring01.adapters;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.entities.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public CategoryDto toCategoryDto(Category category){
        CategoryDto categoryDto = CategoryDto
                .builder()
                .name(category.getName())
                .build();
        return categoryDto;
    }

    public Category toCategory(CategoryDto categoryDto){
        Category category = Category
                .builder()
                .name(categoryDto.getName())
                .build();
        return category;
    }
}
