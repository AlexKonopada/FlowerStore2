package com.example.flowerstore.items;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FlowerBucket extends Item{
    private List<Flower> bucket;
    private String description;

    public FlowerBucket() {
        this.bucket = new ArrayList<Flower>();
    }

    public void add(Flower flower) {
        bucket.add(flower);
    }
    @Override
    public double price() {
        double res = 0;
        for (Flower flower : bucket) {
            res += flower.price();
        }
        return res;
    }

    public boolean searchFlower(Flower flower) {
        for (Flower flower1: bucket) {
            if (flower1.getDescription() == flower.getDescription()) {
                return true;
            }
        }
        return false;
    }


}
