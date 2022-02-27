package com.company.chekel.task1;

import com.company.chekel.task1.entity.CustomArray;
import com.company.chekel.task1.service.CustomArrayReader;
import com.company.chekel.task1.service.CustomArraySortService;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        CustomArrayReader reader = new CustomArrayReader("C:/Users/achek/IdeaProjects/Task/src/com/company/chekel/task1/Data.txt");
        reader.readAndShow();
        CustomArray array = new CustomArray(5, 6, 8, 2, 3, 7, 9);
        System.out.println(array);
    }
}
