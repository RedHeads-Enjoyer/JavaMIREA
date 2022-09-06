package com.company;

public class Book {
    private String author;
    private int year;

    public Book(String author, int year) {
        this.author = author;
        this.year = year;
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(int year) {
        this.year = year;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int howOld() {
        return 2022 - year;
    }

    public String toString() {
        return "year: " + year + ", author: " + author;
    }
}
