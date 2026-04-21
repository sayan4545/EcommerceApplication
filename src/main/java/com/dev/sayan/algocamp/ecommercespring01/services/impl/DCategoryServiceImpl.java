package com.dev.sayan.algocamp.ecommercespring01.services.impl;

import com.dev.sayan.algocamp.ecommercespring01.adapters.CategoryMapper;
import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.entities.Category;
import com.dev.sayan.algocamp.ecommercespring01.repositories.CategoryRepository;
import com.dev.sayan.algocamp.ecommercespring01.services.DCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DCategoryServiceImpl implements DCategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public DCategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(categoryMapper::toCategoryDto)
                .toList();
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category toCreateCategory = categoryMapper.toCategory(categoryDto);
        categoryRepository.save(toCreateCategory);
        return categoryDto;
    }

    @Override
    public Optional<CategoryDto> getCategoryById(Long categoryId) {
        Category category = categoryRepository
                .findById(categoryId)
                .orElseThrow(()-> new RuntimeException("No category exists by the categoryId: "+ categoryId));
        CategoryDto categoryDto = categoryMapper.toCategoryDto(category);
        return Optional.of(categoryDto);
    }
}
