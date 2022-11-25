package com.example.flowerstore;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.items.Item;
import com.example.flowerstore.payment.Payment;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Setter
public class Order {
    private final List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        items = new LinkedList<>();
    }
    public double calculateTotalPrice() {
        double res = 0;
        for(Item item : items) {
            res = res + item.price();
        }
        return res;
    }

    public void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int idx) {
        items.remove(idx);
    }
}
