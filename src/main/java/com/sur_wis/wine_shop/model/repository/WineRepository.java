package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {

}
