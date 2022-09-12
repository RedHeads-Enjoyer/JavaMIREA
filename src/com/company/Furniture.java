package com.company;

public abstract class Furniture {
    private int legCount;
    private int price;
    private int height;
    private boolean sold;

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
