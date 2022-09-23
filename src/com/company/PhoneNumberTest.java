package com.company;

public class PhoneNumberTest {
    public void test() {
        PhoneNumber phoneNumber1 = new PhoneNumber("+79175655655");
        System.out.println(phoneNumber1.getPhoneNumber());

        PhoneNumber phoneNumber2 = new PhoneNumber("+104289652211");
        System.out.println(phoneNumber2.getPhoneNumber());

        PhoneNumber phoneNumber3 = new PhoneNumber("89175655655");
        System.out.println(phoneNumber3.getPhoneNumber());
    }
}
