package com.dev.sayan.algocamp.ecommercespring01.controllers;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.services.RestProductservice;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/api/products")
public class ProductControllertRestTemplate {

    private final RestProductservice restProductservice;
    public ProductControllertRestTemplate(RestProductservice restProductservice){
        this.restProductservice = restProductservice;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) throws Exception{
        return new ResponseEntity<>(restProductservice.getProductById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) throws Exception{
        return new ResponseEntity<>(restProductservice.createProduct(productDto),HttpStatus.CREATED);
    }
}
