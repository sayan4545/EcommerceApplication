package com.dev.sayan.algocamp.ecommercespring01.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreCategoryResponseDto {

    private String message;
    private String status;
    private List<String> categories;
}
