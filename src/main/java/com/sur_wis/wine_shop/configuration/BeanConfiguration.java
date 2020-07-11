package com.sur_wis.wine_shop.configuration;

import com.sur_wis.wine_shop.model.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    ProductService productService() {
        return new ProductService();
    }

}
