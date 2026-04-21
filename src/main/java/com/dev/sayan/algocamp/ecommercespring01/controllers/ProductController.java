package com.dev.sayan.algocamp.ecommercespring01.controllers;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.services.DProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final DProductService dProductService;

    public ProductController( DProductService dProductService){
        this.dProductService = dProductService;

    }



    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto){
        return ResponseEntity.ok(dProductService.createProduct(dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(dProductService.getProductById(id),HttpStatus.FOUND);
    }
    @GetMapping(path="/allProducts")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        return new ResponseEntity<>(dProductService.getAllProducts(),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteProductById(@PathVariable Long id){
        return new ResponseEntity<>(dProductService.deleteProductById(id),HttpStatus.OK);
    }
}
