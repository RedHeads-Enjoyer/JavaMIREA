package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\nEx1");
        PhoneNumberTest phoneNumberTest = new PhoneNumberTest();
        phoneNumberTest.test();


        System.out.println("\nEx2");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        FileReader reader = new FileReader(filename);

    }
}
