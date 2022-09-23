package com.company;

import java.util.StringTokenizer;

public class Shirt {
    private String id;
    private String type;
    private String color;
    private String size;

    public Shirt(String shirt) {
        String[] strings = new String[4];
        strings = shirt.split(",");
        id    = strings[0];
        type  = strings[1];
        color = strings[2];
        size  = strings[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
