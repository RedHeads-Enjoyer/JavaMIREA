package com.company;

public class Person {
    private String name       = "";
    private String surname    = "";
    private String patronymic = "";

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Person() {
    }

    public String getFIO() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(surname).append(" ");
        if (!name.isEmpty())       stringBuilder.append(name). append(".");
        if (!patronymic.isEmpty()) stringBuilder.append(" ").append(patronymic).append(".");
        return stringBuilder.toString();
    }
}
