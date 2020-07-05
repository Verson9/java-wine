package com.sur_wis.wine_shop.model;

public abstract class Product {
    String name;
    String type;
    String description;
    String price;

    public Product() {
    }

    public Product(String name, String type, String description, String price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
