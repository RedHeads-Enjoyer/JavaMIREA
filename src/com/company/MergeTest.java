package com.company;

import java.util.Comparator;

public class MergeTest extends BaseStudentClass{

    // Слияние массивов и вызов метода сортировки
    public Student[] MergeArr(Student[] students1, Student[] students2, Comparator<Student> sort) {
        Student[] students = new Student[students1.length + students2.length];
        Student[] temp = new Student[students.length];
        System.arraycopy(students1, 0, students, 0, students1.length);
        System.arraycopy(students2, 0, students, students1.length, students2.length);
        MergeSort(students, 0, students.length - 1, temp, sort);
        return students;
    }

    // Разделение массива на подмассивы
    public void MergeSort(Student[] students, int start, int end, Student[] temp, Comparator<Student> sort) {
        if (start < end) {
            int m = start + (end - start) / 2;
            MergeSort(students, start, m, temp, sort);
            MergeSort(students, m + 1, end, temp, sort);
            Merge(students, start, m, end, temp, sort);
        }
    }

    // Слияние 2х массивов в 1 упорядоченный
    public void Merge(Student[] students, int start, int middle, int end, Student[] temp, Comparator<Student> sort) {
        int pb = 0;
        int p1 = start;
        int p2 = middle + 1;

        while (p1 <= middle && p2 <= end) {
            if (sort.compare(students[p1], students[p2]) > 0) temp[pb++] = students[p1++];
            else temp[pb++] = students[p2++];
        }

        while (p1 <= middle) temp[pb++] = students[p1++];
        while (p2 <= end) temp[pb++] = students[p2++];
        if (end - start + 1 >= 0) System.arraycopy(temp, 0, students, start, end - start + 1);
    }

    public void test() {
        int a = input();
        int b = input();
        Student[] students1 = randArr(a);
        Student[] students2 = randArr(b);
        System.out.print("(1) Before: "); // Вывод до
        printArr(students1);
        System.out.print("\n(2) Before: "); // Вывод до
        printArr(students2);
        Student[] students = MergeArr(students1, students2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getiDNumbers() - o1.getiDNumbers();
            }
        });
        System.out.print("\nAfter: "); // Вывод после
        printArr(students);
    }
}
