package com.company;

public class Ball {
    private int weight;
    private String color;

    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Ball(int weight) {
        this.weight = weight;
    }

    public Ball(String color) {
        this.color = color;
    }

    public Ball() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double radius() {  // При учете плотности 1000 кг/м^3
        double v = (double) weight / 1000;
        return Math.pow((3 * v) / (4 * Math.PI), 1.f/3);
    }

    public String toString() {
        return "color: " + color + ", weight: " + weight + "g";
    }
}
