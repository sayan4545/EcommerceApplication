package com.dev.sayan.algocamp.ecommercespring01.gateway.api;

import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreCategoryResponseDto;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;


public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDto> getAllFakeCategories();
}
