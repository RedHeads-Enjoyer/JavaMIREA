package com.company;

public class AddressTest {
    public void test() {
        Address address1 = new Address("a. b: c- d- e: f: g");
        System.out.println(address1.toString());

        Address address2 = new Address("a, b, c, d, e, f, g");
        System.out.println(address2.toString());

        Address address3 = new Address("a. b,,,,,,,,,,,,,, c,,,,,,,, d, e,,,,,,,,,,,,,,, f, g");
        System.out.println(address3.toString());

        Address address4 = new Address("a b c d e f g");
        System.out.println(address4.toString());
    }
}
