package com.dev.sayan.algocamp.ecommercespring01.configurations;


import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreCategoryApi;
import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreCreateProductApi;
import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreProductApi;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;


@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }
    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreProductApi.class);
    }
    @Bean
    public FakeStoreCreateProductApi fakeStoreCreateProductApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCreateProductApi.class);
    }
    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
    }
    @Bean
    public Gson gson(){
        return new Gson();
    }

}
