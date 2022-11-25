package com.example.flowerstore.delivery;

import com.example.flowerstore.items.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        for (Item item: items) {
            System.out.println(item.getDescription() + " delivered by Post");
        }
    }
}

