package com.company;

public class Milk implements Priceable{
    private int price;
    private int weight;

    public Milk(int price, int weight) {
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
        return "Type: milk, price: " + price + ", weight: " + weight;
    }
}
