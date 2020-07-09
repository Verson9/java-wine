package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.WineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<WineEntity, Long> {
}
