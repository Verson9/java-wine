package com.sur_wis.wine_shop;

import com.sur_wis.wine_shop.model.core.App;
import com.sur_wis.wine_shop.model.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WineShopApplication {
    private static App app;

    public static void main(String[] args) {
        ProductRepository productRepository;
        SpringApplication.run(WineShopApplication.class, args);
        System.out.println("\n\n--------------------Spring app is running--------------------");
        app.app();
    }

}
