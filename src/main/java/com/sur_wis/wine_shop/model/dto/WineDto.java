package com.sur_wis.wine_shop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WineDto {
    Long id;
    String name;
    String description;
    String region;
    String country;
    int price;
}
