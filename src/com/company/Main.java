package com.company;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread(50, 400);
        Milk milk = new Milk(90, 950);

        System.out.println(milk.toString());
        System.out.println(bread.toString());

        milk.setPrice(200);

        System.out.println("\n" + milk.toString());
        System.out.println(bread.toString());

        bread.setPrice(70);

        System.out.println("\n" + milk.toString());
        System.out.println(bread.toString());
    }
}
