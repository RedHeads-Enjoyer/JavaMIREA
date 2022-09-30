package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String FIO = scanner.nextLine();
        String INN = scanner.nextLine();
        if (!INN.matches("[0-9]{12}")) throw new Exception("Wrong INN");
    }
}
