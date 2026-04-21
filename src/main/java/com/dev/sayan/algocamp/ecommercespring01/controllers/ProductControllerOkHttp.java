package com.dev.sayan.algocamp.ecommercespring01.controllers;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.services.ProductServiceHttp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/api/products")
public class ProductControllerOkHttp {

    private final ProductServiceHttp productServiceHttp;

    public ProductControllerOkHttp(ProductServiceHttp productServiceHttp){
        this.productServiceHttp = productServiceHttp;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(productServiceHttp.getProductById(id), HttpStatus.FOUND);
    }
}
