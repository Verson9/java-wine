package com.sur_wis.wine_shop.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.sur_wis.wine_shop.model.repository")
@EntityScan(basePackages = "com.sur_wis.wine_shop.model.entity")
public class SpringDataConfiguration {
}
