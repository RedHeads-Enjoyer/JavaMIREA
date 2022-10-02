package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void directoryReader(String path){
        File file = new File(path);
        String[] fArray = null;

        if (file.exists() || file.isDirectory()) fArray = file.list();
        else System.out.print("Directory is not available");

        ArrayList list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i < list.size() && i < 5;i++)
            System.out.println(list.get(i));
    }

    public static void main(String[] args) {
        System.out.println("\nEx1");
        directoryReader("C:\\");

        System.out.println("\nEx2");
        new Solution().test();
    }
}
