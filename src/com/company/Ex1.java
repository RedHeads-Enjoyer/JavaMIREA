package com.company;

import java.util.*;

public class Ex1 {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String string = "Оля,Петя.Нина,Николай: Дима; adsfvsf, fsdfdfv";
        System.out.println("Before: " + string);
        System.out.print("regex: ");
        String regex = scanner.nextLine();

        // Работа со строкой
        List<String> arrayList = Arrays.asList(string.split(regex));

        // Вывод итоговой строки
        System.out.print("After: ");
        for (String s : arrayList)
            System.out.print(s.strip() + " ");
    }
}
