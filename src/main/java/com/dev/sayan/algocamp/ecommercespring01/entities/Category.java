package com.dev.sayan.algocamp.ecommercespring01.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends BaseEntity{
    @Column(nullable = false)
    private String name;

}
