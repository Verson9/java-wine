package com.sur_wis.wine_shop.main;

import com.sur_wis.wine_shop.main.testapp.WineShopApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WineShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(WineShopApplication.class, args);
        System.out.println("\n\n--------------------Spring app is running--------------------");
        WineShopApp wineShopApp = new WineShopApp();
        wineShopApp.app();
    }
}
