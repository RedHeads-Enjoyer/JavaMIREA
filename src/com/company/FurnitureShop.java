package com.company;

public class FurnitureShop {
    public void test() {
        Chair chair1 = new Chair(4, 1000, 40, false);
        Chair chair2 = new Chair(1, 3000, 60, false);
        Table table = new Table(4, 5000, 60, false);

        System.out.println(chair1.toString());
        System.out.println(chair2.toString());
        System.out.println(table.toString());

        if (!chair1.isSold()) {
            chair1.buy();
            System.out.println("U just bought a chair");
        }
        else {
            System.out.println("Chair already sold");
        }

        if (!chair1.isSold()) {
            chair1.buy();
            System.out.println("U just bought a chair");
        }
        else {
            System.out.println("Chair already sold");
        }

        if (!table.isSold()) {
            table.buy();
            System.out.println("U just bought a table");
        }
        else {
            System.out.println("Table already sold");
        }
    }
}
