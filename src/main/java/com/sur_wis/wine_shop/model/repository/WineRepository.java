package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.WineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WineRepository extends JpaRepository<WineEntity, Long> {
    WineEntity getOne(Long aLong);

    List<WineEntity> findAll();

    void deleteById(Long aLong);

    List<WineEntity> getAll();

}
