package com.company;

public class Table extends Furniture{


    public Table(int legCount, int price, int height, boolean sold) {
        super(legCount, price, height, sold);
    }

    @Override
    public String toString() {
        return "furniture: table, legs: " + getLegCount() + ", price: " + getPrice() + ", height: " + getHeight() + ", sold: " + isSold();
    }

    @Override
    public boolean canSitOn() {
        return false;
    }
}
