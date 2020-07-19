package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoriesRepository extends JpaRepository<Accessory, Long> {
}
