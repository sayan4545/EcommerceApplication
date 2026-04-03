package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;

import java.io.IOException;
import java.util.List;


public interface ICategoryService {

    List<CategoryDto> getAllcategories() throws IOException;
}
