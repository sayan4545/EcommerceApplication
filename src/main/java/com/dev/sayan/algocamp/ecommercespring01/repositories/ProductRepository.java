package com.dev.sayan.algocamp.ecommercespring01.repositories;

import com.dev.sayan.algocamp.ecommercespring01.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
