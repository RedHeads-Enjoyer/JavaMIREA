package com.company;

import java.util.Random;
import java.util.Scanner;

public class InsertionTest extends BaseStudentClass{

    public Student[] insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            int j = i;
            Student temp = students[i];
            while (j > 0 && students[j - 1].getiDNumbers() > temp.getiDNumbers()) {
                students[j] = students[j - 1];
                j--;
            }
            students[j] = temp;
        }
        return students;
    }

    public void test() {
        int a = input();
        Student[] students = randArr(a);
        System.out.print("Before: "); // Вывод до
        printArr(students);
        students =  insertionSort(students); // Сортировка
        System.out.print("\nAfter: "); // Вывод после
        printArr(students);
    }
}
