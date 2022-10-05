package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static boolean isFull = false;

    public static  int rec1(int a, int b, int i) {
        i++;
        if (i > 100) {
            isFull = true;
        }
        if (isFull) {
            return -1;
        }
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return rec1(a - 1, b - 1, i) + rec1(a, b - 1, i);
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

    public static void rec4(String s) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 1) s += a + " ";
        if (a != 0) rec4(s);
        else System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер в списке - 9");

        System.out.println("Ex 9");
        int a = scanner.nextInt(); // 0
        int b = scanner.nextInt(); // 1
        int l = rec1(a, b, 0);
        if (!isFull) {
            System.out.println(l);
        }
        else System.out.println("Рекурсия переполнена!");

        System.out.println("Ex 10");
        int n = scanner.nextInt();
        System.out.println(rec2(n, 0));

        System.out.println("Ex 11");
        int s = rec3(2, 0);
        System.out.println(s);

        System.out.println("Ex 12");
        rec4("");
    }
}

