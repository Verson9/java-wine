package com.sur_wis.wine_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(value = {"com.sur_wis.wine_shop.model.repository"})
@EntityScan(value = {"com.sur_wis.wine_shop.model.entity"})
@SpringBootApplication
public class WineShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(WineShopApplication.class, args);
    }
}
