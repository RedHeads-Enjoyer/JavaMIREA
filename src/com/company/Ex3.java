package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public void test() {
        String string = "034523.50.433     USD  nonfvd4553      RUB 44     ERR  sdjfgfh435f.3RUB 00004.54  EU";
        String regEx = "([1-9][0-9]*)([.][0-9]+)?\\s+((RUB)|(EU)|(USD))\\s";
        System.out.println(string);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            System.out.println(matcher.group().replaceAll("\\s{2,}"," "));
        }
    }
}
