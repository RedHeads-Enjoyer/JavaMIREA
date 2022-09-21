package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("D:\\Test\\Java\\25.txt", true);
        String temp;
        Scanner scanner = new Scanner(System.in);
        do {
            temp =  scanner.nextLine();
            writer.write(temp.toString());
            writer.write("\n");
            writer.flush();
        } while (!Objects.equals(temp, ""));
    }
}
