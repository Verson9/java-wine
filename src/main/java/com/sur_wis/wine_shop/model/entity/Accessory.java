package com.sur_wis.wine_shop.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity(name = "accessories")
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    Long id;

    @Column(nullable = false, name = "name")
    String name;

    @Column(nullable = false, name = "description")
    String description;

    @Column(nullable = false, name = "type")
    String type;

    @Column(nullable = false, name = "price")
    int price;
}
