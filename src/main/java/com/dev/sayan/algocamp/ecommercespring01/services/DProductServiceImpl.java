package com.dev.sayan.algocamp.ecommercespring01.services;

import com.dev.sayan.algocamp.ecommercespring01.adapters.ProductMapper;
import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.entities.Product;
import com.dev.sayan.algocamp.ecommercespring01.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DProductServiceImpl implements DProductService{
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    public DProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository){
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }
    @Override
    public ProductDto createProduct(ProductDto dto) {
        Product productToBeCreated = productMapper.toProduct(dto);
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
