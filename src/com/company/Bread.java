package com.company;

public class Bread implements Priceable{
    private int price;
    private int weight;

    public Bread(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Type: bread, price: " + price + ", weight: " + weight;
    }
}
