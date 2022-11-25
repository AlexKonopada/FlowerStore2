package com.example.flowerstore.payment;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Price payed: " + price + " by Paypal");
    }
}
