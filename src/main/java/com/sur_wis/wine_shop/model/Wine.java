package com.sur_wis.wine_shop.model;

public class Wine extends Product {
    String color;
    String country;
    String region;
    String tasteType;
    int yearOfProduction;

    public Wine() {
    }

    public Wine(String name, String description, String price) {
        super(name, "wine", description, price);
    }

    public Wine(String name, String description, String price, String color, String country, String region, String tasteType, int yearOfProduction) {
        super(name, "wine", description, price);
        this.color = color;
        this.country = country;
        this.region = region;
        this.tasteType = tasteType;
        this.yearOfProduction = yearOfProduction;
    }
}
