package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static  int rec1(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return rec1(a - 1, b - 1) + rec1(a, b - 1);
    }

    public static int rec2(int n, int a) {
        if (n == 0) return a;
        return rec2(n / 10, 10 * a + n % 10);
    }

    public static int rec3(int last, int s) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a != 0  || last != 0) {
            if (a == 1) return rec3(a, s + 1);
            else return rec3(a, s);
        }
        else {
            return s;
        }
    }

    public static void rec4() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a != 0) rec4();
        if (a % 2 == 0 && a != 0) System.out.println(a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер в списке - 9");

        System.out.println("Ex 9");
        int a = scanner.nextInt(); // 0
        int b = scanner.nextInt(); // 1
        System.out.println(rec1(a, b));

        System.out.println("Ex 10");
        int n = scanner.nextInt();
        System.out.println(rec2(1234, 0));

        System.out.println("Ex 11");
        int s = rec3(2, 0);
        System.out.println(s);

        System.out.println("Ex 12");
        rec4();

    }
}

