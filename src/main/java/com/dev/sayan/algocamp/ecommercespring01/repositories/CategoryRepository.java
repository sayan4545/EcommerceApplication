package com.dev.sayan.algocamp.ecommercespring01.repositories;

import com.dev.sayan.algocamp.ecommercespring01.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
