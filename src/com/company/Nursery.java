package com.company;

public class Nursery {
    public void test() {
        Dog dog1 = new Dog("Max", 5);
        Dog dog2 = new Dog("Clinkz", 11);
        Dog dog3 = new Dog("Meepo", 4);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        dog1.setAge(2);
        dog2.setName("XQc");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
