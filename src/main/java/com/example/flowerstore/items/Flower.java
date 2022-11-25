package com.example.flowerstore.items;


import lombok.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Flower implements Item{
    @Id
    @GeneratedValue
    private int id;
    private double sepalLength;
    private double price;
    private String color;

    public double price(){
        return price;
    }



}
