package com.sur_wis.wine_shop.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity( name = "wines" )
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Setter
//@Getter
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
