package com.sur_wis.wine_shop;

import com.sur_wis.wine_shop.model.core.App;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WineShopApplication {


    public static void main(String[] args) {
        App app = new App();
        SpringApplication.run(WineShopApplication.class, args);
        System.out.println("\n\n--------------------Spring app is running--------------------");
        app.app();
    }

}
