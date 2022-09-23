package com.company;

public class PhoneNumber {
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumber(String phoneNumber) {
        int len = phoneNumber.length();

        // Постановка "-" в нужнах местах
        phoneNumber = new StringBuffer(phoneNumber).insert(phoneNumber.length() - 4, "-").toString();
        phoneNumber = new StringBuffer(phoneNumber).insert(phoneNumber.length() - 8, "-").toString();
        phoneNumber = new StringBuffer(phoneNumber).insert(phoneNumber.length() - 12, " ").toString();

        // Добавить "+" в начало и уменьшить первый символ на 1
        if (phoneNumber.charAt(0) != '+') {
            phoneNumber =  phoneNumber.replace(phoneNumber.charAt(0), (char) (((int) phoneNumber.charAt(0)) - 1));
            phoneNumber = new StringBuffer(phoneNumber).insert(0, "+").toString();
        }
        this.phoneNumber = phoneNumber;
    }
}
