package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreProductDto;
import com.dev.sayan.algocamp.ecommercespring01.dto.ProductDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreCreateProductApi;
import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductGateway implements ProductGateway{
    private final FakeStoreProductApi fakeStoreProductApi;
    private final FakeStoreCreateProductApi fakeStoreCreateProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi,
                                   FakeStoreCreateProductApi fakeStoreCreateProductApi){
        this.fakeStoreProductApi = fakeStoreProductApi;
        this.fakeStoreCreateProductApi = fakeStoreCreateProductApi;
    }
    @Override
    public ProductDto getProductById(Long id) throws Exception {
        FakeStoreProductDto fakeStoreProductDto = this.fakeStoreProductApi.getProductByID(id)
                .execute()
                .body();
        if(fakeStoreProductDto == null) throw new RuntimeException("No product");
        return fakeStoreProductDto.getProductDto();
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws IOException {
        FakeStoreProductDto response = this.fakeStoreCreateProductApi.createProduct(productDto)
                .execute().body();
        if(response == null) throw new RuntimeException("INVALID");
        return response.getProductDto();
    }
}
