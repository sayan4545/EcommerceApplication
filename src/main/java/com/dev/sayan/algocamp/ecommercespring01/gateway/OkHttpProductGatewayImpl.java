package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
public class OkHttpProductGatewayImpl implements OkHttpProdGateway{

    private final OkHttpClient okHttpClient;
    private final String baseUrl = "https://fakestoreapi.com/products" ;
    private final Gson gson;

    public OkHttpProductGatewayImpl(OkHttpClient okHttpClient,Gson gson){
        this.okHttpClient = okHttpClient;
        this.gson = gson;
    }
    @Override
    public ProductDto getProductById(Long id) throws Exception {
        Request request = new Request.Builder()
                .url(baseUrl + "/" + id)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String json = response.body().string();
                return gson.fromJson(json, ProductDto.class);
            } else {
                throw new Exception("Request failed with code: " + response.code());
            }
        }
    }
}


