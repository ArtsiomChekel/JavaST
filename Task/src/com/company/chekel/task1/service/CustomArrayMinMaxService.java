package com.company.chekel.task1.service;

public class CustomArrayMinMaxService {

    public int findMaxValue(int[] array){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public int findMinValue(int[] array){
        int minValue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < minValue)
            {
                minValue = array[i];
            }
        }
        return minValue;
    }

}
