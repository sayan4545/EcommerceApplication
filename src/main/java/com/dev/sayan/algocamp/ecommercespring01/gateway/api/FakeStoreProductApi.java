package com.dev.sayan.algocamp.ecommercespring01.gateway.api;

import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreProductDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductDto> getProductByID(@Path("id") Long id);
}
