package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class BaseStudentClass {

    public Student[] randArr(int len) { // Создание случайного массива
        Student[] students = new Student[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            students[i] = new Student();
            students[i].setiDNumbers(random.nextInt(100));
        }
        return students;
    }

    public void printArr(Student[] students) { // Вывод массива
        for (Student student : students) {
            System.out.print(student.getiDNumbers() + "   ");
        }
    }

    public int test(Callable<Student[]> func) { // Ввод подходящих чисел
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива (1 - 100): ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a < 1 || a > 100) {
                System.out.println("Введено некорректное число, значние установлено в 10");
                return 10;
            }
        }
        else {
            System.out.println("Введено не натуральное число, значение будет установлено в 10");
            return 10;
        }
        return a;
    }
}
