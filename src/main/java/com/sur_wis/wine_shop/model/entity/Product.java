package com.sur_wis.wine_shop.model.entity;

import javax.persistence.*;

@Entity( name = "products" )
@EntityListeners( WineRepository.class )
public class Product {
    String name;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
