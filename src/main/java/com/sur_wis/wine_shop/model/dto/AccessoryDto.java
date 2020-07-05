package com.sur_wis.wine_shop.model.dto;

public class AccessoryDto extends ProductDto {
    String subtype;

    public AccessoryDto(Integer id,String name, String description, Integer price, String subtype) {
        super(id,name, "accessory", description, price);
        this.subtype = subtype;
    }

    public AccessoryDto() {
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }


    @Override
    public String toString() {
        return "AccessoryDto{" +
                ", subtype='" + subtype + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
