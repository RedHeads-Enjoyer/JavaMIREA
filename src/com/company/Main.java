package com.company;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
	    int[] arr;

        int numOfNum = 0, maxNum = 0, temp;

        System.out.println("Введите количество чисел в массиве: ");
        if (scanner.hasNextInt()) {
            numOfNum = scanner.nextInt();
            if (numOfNum <= 0) {
                System.out.println("Вы ввели не натуральное число, будет установлено значнение 10");
                numOfNum = 10;
            }
        }
        else {
            System.out.println("Вы ввели не натуральное число, будет установлено значнение 10");
            numOfNum = 10;
        }

        System.out.println("Введите максимальное по модулю число");
        if (scanner.hasNextInt()) {
            maxNum = scanner.nextInt();
            if (maxNum <= 0) {
                System.out.println("Вы ввели не натуральное число, будет установлено значнение 10");
                maxNum = 10;
            }
        }
        else {
            System.out.println("Вы ввели не натуральное число, будет установлено значнение 10");
            maxNum = 10;
        }

        arr = new int[numOfNum];

        for (int i = 0; i < numOfNum; i++) {
            arr[i] = random.nextInt() % maxNum;
        }

        System.out.print("Изначальный массив: ");
        for (int i = 0; i < numOfNum; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < numOfNum - 1; i++) {
            for (int j = 0; j < numOfNum - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < numOfNum; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
