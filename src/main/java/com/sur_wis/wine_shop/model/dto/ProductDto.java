package com.sur_wis.wine_shop.model.dto;

public abstract class ProductDto {
    Integer id;
    String name;
    String type;
    String description;
    Integer price;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, String type, String description, Integer price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public ProductDto(String name, String type, String description, Integer price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
