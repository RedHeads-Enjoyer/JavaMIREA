package com.company;

public class Ball {
    public int weight;
    public String material;

    public Ball(int weight, String material) {
        this.weight = weight;
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
