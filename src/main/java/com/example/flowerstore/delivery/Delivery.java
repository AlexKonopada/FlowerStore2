package com.example.flowerstore.delivery;

import com.example.flowerstore.items.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
