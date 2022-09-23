package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String frame;
    private String flat;

    public Address(String adress) {
        adress = adress.trim();
        // Реализация через split
//        String[] strings = adress.split(", ");
//        country = strings[0];
//        region  = strings[1];
//        city    = strings[2];
//        street  = strings[3];
//        house   = strings[4];
//        frame   = strings[5];
//        flat    = strings[6];

        // Реализация через StringTokenizer
        StringTokenizer strings = new StringTokenizer(adress, " -.,:", false);
        country = strings.nextToken();
        region  = strings.nextToken();
        city    = strings.nextToken();
        street  = strings.nextToken();
        house   = strings.nextToken();
        frame   = strings.nextToken();
        flat    = strings.nextToken();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", frame='" + frame + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
