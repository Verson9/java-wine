package com.sur_wis.wine_shop.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity( name = "product" )
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    Long id;

    String name;
}
