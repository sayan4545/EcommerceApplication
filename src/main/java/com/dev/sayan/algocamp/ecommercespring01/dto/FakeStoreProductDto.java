package com.dev.sayan.algocamp.ecommercespring01.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreProductDto {

    private ProductDto productDto;
    private String message;
    private String status;
}
