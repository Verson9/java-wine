package com.sur_wis.wine_shop.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Setter
//@Getter
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
