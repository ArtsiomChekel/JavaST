package com.company.chekel.task1.service;
import java.io.*;
import java.util.ArrayList;

public class CustomArrayReader {

    private String pathToFile;
    public CustomArrayReader (String path)
    {
        pathToFile = path;
    }

    public void readAndShow() throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String str;
        ArrayList<String> list = new ArrayList<String>();
        while((str = reader.readLine()) != null ){
            if(!str.isEmpty()){
                list.add(str);
                System.out.println(str);
            }
        }
    }
}

