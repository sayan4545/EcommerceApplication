package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.adapters.ProductMapper;
import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.entities.Category;
import com.dev.sayan.algocamp.ecommercespring01.entities.Product;
import com.dev.sayan.algocamp.ecommercespring01.repositories.CategoryRepository;
import com.dev.sayan.algocamp.ecommercespring01.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DProductServiceImpl implements DProductService{
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    public DProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productMapper = productMapper;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public ProductDto createProduct(ProductDto dto) {
        //if (!ifCategoryExists(dto.getCategoryId())) throw new RuntimeException("Category do nit exists");
        Category category = categoryRepository
                .findById(dto.getCategoryId()).orElseThrow(()->
                        new RuntimeException("Category do not exist"));
        Product productToBeCreated = productMapper.toProduct(dto,category);
        productRepository.save(productToBeCreated);
        return dto;
    }

    private Boolean isExistsById(Long id){
        return productRepository.existsById(id);
    }

    @Override
    public ProductDto getProductById(Long id) {
//        if(!isExistsById(id)) throw new RuntimeException("No product exist with this id "+ id);
//        Product product = productRepository.findById(id).get();
//        return productMapper.toProductDto(product);
        Product retrievedProduct = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("No product with this id "+ id));
        return productMapper.toProductDto(retrievedProduct);

    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toProductDto)
                .toList();
    }

    public Boolean deleteProductById(Long id){
        if (!isExistsById(id)) return false;
        productRepository.deleteById(id);
        return true;
    }
}
