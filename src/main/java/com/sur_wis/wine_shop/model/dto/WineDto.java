package com.sur_wis.wine_shop.model.dto;

public class WineDto extends ProductDto {
    Integer wineId;
    String color;
    String country;
    String region;
    String tasteType;
    int yearOfProduction;

    public WineDto(String name, String description, Integer price, String color, String country, String region, String tasteType, int yearOfProduction) {
        super(name, "wine", description, price);
        this.color = color;
        this.country = country;
        this.region = region;
        this.tasteType = tasteType;
        this.yearOfProduction = yearOfProduction;
    }
    public WineDto(Integer id, String name, String description, Integer price, String color, String country, String region, String tasteType, int yearOfProduction) {
        super(id, name, "wine", description, price);
        this.wineId = id;
        this.color = color;
        this.country = country;
        this.region = region;
        this.tasteType = tasteType;
        this.yearOfProduction = yearOfProduction;
    }

    public WineDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTasteType() {
        return tasteType;
    }

    public void setTasteType(String tasteType) {
        this.tasteType = tasteType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Integer getWineId() {
        return wineId;
    }

    public void setWineId(Integer wineId) {
        this.wineId = wineId;
    }

    @Override
    public String toString() {
        return "WineDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", tasteType='" + tasteType + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price='" + price + '\'' +
                '}';
    }
}
