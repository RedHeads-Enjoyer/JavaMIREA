package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String regEx = "([0-9]+)(\\s)*[\\+]";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) System.out.println("Found");
        else System.out.println("Not found");
    }
}
