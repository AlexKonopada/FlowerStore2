package com.example.flowerstore.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Price payed: " + price + " by credit card");
    }
}
