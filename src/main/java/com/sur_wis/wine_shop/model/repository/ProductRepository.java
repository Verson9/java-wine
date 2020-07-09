package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
