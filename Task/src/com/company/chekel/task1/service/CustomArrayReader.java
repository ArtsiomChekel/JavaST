package com.company.chekel.task1.service;

import java.io.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayReader {

    private String pathToFile;

    public CustomArrayReader(String path) {
        pathToFile = path;
    }

    public List<String> readAndShow() throws IOException {
        List<String> result = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String str;
        while ((str = reader.readLine()) != null) {
                result.add(str);
        }
        return result;
    }
}

