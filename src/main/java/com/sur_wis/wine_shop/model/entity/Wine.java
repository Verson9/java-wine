package com.sur_wis.wine_shop.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity( name = "wines" )
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Wine {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(nullable = false, name = "id")
    Long id;

    @Column(nullable = false, name = "name")
    String name;

    @Column(nullable = false, name = "description")
    String description;

    @Column(nullable = false, name = "region")
    String region;

    @Column(nullable = false, name = "country")
    String country;

    @Column(nullable = false, name = "price")
    int price;
}
