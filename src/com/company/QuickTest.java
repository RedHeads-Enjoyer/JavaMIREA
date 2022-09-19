package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class QuickTest extends BaseStudentClass{

    private static int partition(Student[] students, int low, int high, SortingStudentsByGPA sort) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (sort.compare(students[j], pivot) < 0) {
                i++;

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public Student[] quickSort(Student[] students, int low, int high, SortingStudentsByGPA sort) {
        if (low < high) {
            int index = partition(students, low, high, sort);

            quickSort(students, low, index - 1, sort);
            quickSort(students, index + 1, high, sort);
        }
        return students;
    }

    public void test() {
        int a = input();
        Student[] students = randArr(a);
        System.out.print("Before: "); // Вывод до
        printArr(students);
        students =  quickSort(students, 0, students.length - 1, new SortingStudentsByGPA()); // Сортировка
        System.out.print("\nAfter: "); // Вывод после
        printArr(students);
    }
}
