package com.company;

public class Library {
    public void test() {
        Book book1 = new Book("Xaer Sergeevi4", 2003);
        Book book2 = new Book("Paj Abuzerovi4", 2015);
        Book book3 = new Book("Praton Andreevi4", 2020);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        book3.setYear(2013);
        System.out.println(book3.toString());
        System.out.println(book3.howOld() + " y.o.");
    }
}
