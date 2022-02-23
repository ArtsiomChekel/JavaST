package com.company.chekel.task1.service;

import com.company.chekel.task1.entity.CustomArray;

public class CustomArrayAverageValueService {

    public double findAverageValue(CustomArray array)
    {
        int[] tmp = array.getCustomArray();
        int summ = 0;
        for (int i = 0; i < tmp.length; i++)
        {
            summ += tmp[i];
        }
        double averageValue = summ / (tmp.length);
        return averageValue;
    }
}
