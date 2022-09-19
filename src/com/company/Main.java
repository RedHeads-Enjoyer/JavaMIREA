package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ex 1");
        InsertionTest insertionTest = new InsertionTest();
        insertionTest.test();

        System.out.println("\n\nEx 2");
        QuickTest quickTest = new QuickTest();
        quickTest.test();

        System.out.println("\n\nEx 3");
        MergeTest mergeTest = new MergeTest();
        mergeTest.test();
    }
}
