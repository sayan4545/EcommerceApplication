package com.dev.sayan.algocamp.ecommercespring01.gateway.api;

import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreProductDto;
import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FakeStoreCreateProductApi {

    @POST("/products")
    Call<FakeStoreProductDto> createProduct(@Body ProductDto productDto);

}
