package com.sur_wis.wine_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class WineShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(WineShopApplication.class, args);
        System.out.println("\n\n--------------------Spring app is running--------------------");

    }
}
