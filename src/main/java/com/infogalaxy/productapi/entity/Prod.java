package com.infogalaxy.productapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "product-data")
public class Prod {

    @Id
    private int id;
    private  String name;
    private String description;
    private int price;
    private int quantity;
    private String status;

}
