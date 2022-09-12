package com.company;

public class Chair extends Furniture{

    public Chair(int legCount, int price, int height, boolean sold) {
        super(legCount, price, height, sold);
    }

    @Override
    public String toString() {
        return "furniture: chair, legs: " + getLegCount() + ", price: " + getPrice() + ", height: " + getHeight() + ", sold: " + isSold();
    }

    @Override
    public boolean canSitOn() {
        return true;
    }
}
