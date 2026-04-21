package com.dev.sayan.algocamp.ecommercespring01.gateway;

import com.dev.sayan.algocamp.ecommercespring01.dto.CategoryDto;
import com.dev.sayan.algocamp.ecommercespring01.dto.FakeStoreCategoryResponseDto;
import com.dev.sayan.algocamp.ecommercespring01.gateway.api.FakeStoreCategoryApi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Primary
public class FakeStoreCategoryGateway implements CategoryGateway{
    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDto> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDto response
                = fakeStoreCategoryApi.getAllFakeCategories()
                .execute().body();

        if(response == null) throw new IOException("Cant find");
        return response.getCategories()
                .stream()
                .map(category-> CategoryDto.builder()
                        .name(category)
                        .build()).toList();

        }
    }

