package com.company.chekel.task1;

import com.company.chekel.task1.entity.CustomArray;
import com.company.chekel.task1.service.CustomArrayReader;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        CustomArray array = new CustomArray();
        int[] array2 = new int[20];
        CustomArrayReader reader = new CustomArrayReader("C:/Users/achek/IdeaProjects/Task/src/com/company/chekel/task1/Data.txt");
        reader.readAndShow();
    }
}
