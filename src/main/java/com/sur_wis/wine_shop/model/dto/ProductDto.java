package com.sur_wis.wine_shop.model.dto;

public class ProductDto {
    Integer id;
    String name;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDto(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
