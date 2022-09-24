package com.company;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Есть 3 стула...");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
