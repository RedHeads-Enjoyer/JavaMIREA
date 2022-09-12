package com.company;

public abstract class Furniture {
    private int legCount;
    private int price;
    private int height;
    private boolean sold;

    public boolean isSold() {
        return sold;
    }

    public int getLegCount() {
        return legCount;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }

    public Furniture(int legCount, int price, int height, boolean sold) {
        this.legCount = legCount;
        this.price = price;
        this.height = height;
        this.sold = sold;
    }

    public abstract String toString();

    public abstract boolean canSitOn();

    public void buy() {
        this.sold = true;
    }
}
