package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(Integer id);

    List<Product> findAll();

    void deleteById(Integer id);

    @Override
    <S extends Product> S save(S s);
}
