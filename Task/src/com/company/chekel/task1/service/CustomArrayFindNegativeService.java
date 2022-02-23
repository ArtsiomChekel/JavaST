package com.company.chekel.task1.service;

import com.company.chekel.task1.entity.CustomArray;

public class CustomArrayFindNegativeService {
    public int findNegativePositive(CustomArray array)
    {
        int tmp[] = array.getCustomArray();
        int numOfPositive = 0;
        for(int i = 0; i < tmp.length; i++)
        {
            if(tmp[i] > 0)
            {
                numOfPositive++;
            }
        }
        return numOfPositive;
    }

}
