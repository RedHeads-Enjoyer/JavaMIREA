package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "__");
        }

        arrayList.remove(4);

        System.out.println("\n");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "__");
        }
    }
}
