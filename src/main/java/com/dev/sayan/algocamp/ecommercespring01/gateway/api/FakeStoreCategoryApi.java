package com.dev.sayan.algocamp.ecommercespring01.gateway.api;

import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreCategoryResponseDto;
import retrofit2.Call;
import retrofit2.http.GET;


public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDto> getAllFakeCategories();
}
