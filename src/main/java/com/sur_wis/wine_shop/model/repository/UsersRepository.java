package com.sur_wis.wine_shop.model.repository;

import com.sur_wis.wine_shop.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
