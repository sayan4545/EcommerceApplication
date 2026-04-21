package com.dev.sayan.algocamp.ecommercespring01.controllers;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.services.DCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    //private final ICategoryService categoryService;
    private final DCategoryService dCategoryService;

    public CategoryController(DCategoryService dCategoryService){
        this.dCategoryService = dCategoryService;
    }
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories() throws IOException {
        return new ResponseEntity<>(this.dCategoryService.getAllCategories(),HttpStatus.FOUND);
    }
    @PostMapping(path = "/createCategory")
    public ResponseEntity<CategoryDto> saveCategory(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(dCategoryService.createCategory(categoryDto),HttpStatus.CREATED);
    }
    @GetMapping(path = "/category/{categoryId}")
    public ResponseEntity<Optional<CategoryDto>> findCategoryById(@PathVariable Long categoryId){
        return new ResponseEntity<>(dCategoryService.getCategoryById(categoryId),HttpStatus.FOUND);
    }
}
