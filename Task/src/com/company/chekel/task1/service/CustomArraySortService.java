package com.company.chekel.task1.service;
import com.company.chekel.task1.entity.CustomArray;

public class CustomArraySortService {

    public void insertionSort(CustomArray array)
    {
        int[] tmp = array.getCustomArray();
        for (int i = 1; i < tmp.length; i++)
        {
            int helpValue = tmp[i];
            int j = i-1;
            for (; j >= 0; j--)
            {
                if (helpValue < tmp[j])
                {
                    tmp[j+1] = tmp[j];
                }
                else{
                    break;
                }
            }
            tmp[j + 1] = helpValue;
        }
    }

    public void exchangeSort(CustomArray array)
    {
        int[] tmp = array.getCustomArray();
        int helpValue = 0;
        while(true) {
            int countOfChanges = 0;
            for (int i = 0; i < tmp.length - 1; i++) {
                if (tmp[i] > tmp[i + 1]) {
                    helpValue = tmp[i];
                    tmp[i] = tmp[i + 1];
                    tmp[i + 1] = helpValue;
                    countOfChanges++;
                }
            }
            if (countOfChanges == 0)
            {break;}
        }
    }

    public void shellSort(CustomArray array) {
        int[] tmp = array.getCustomArray();
        int helpValue = 0;
        int i = 0;
        while (true) {
            if (tmp[0] > tmp[1]){
                helpValue = tmp[0];
                tmp[0] = tmp[1];
                tmp[1] = helpValue;
            }
            if (tmp[i] > tmp[i + 1]) {
                helpValue = tmp[i];
                tmp[i] = tmp[i + 1];
                tmp[i + 1] = helpValue;
                i --;
            }
            else{
                i++;
            }
            if (i > tmp.length - 2)
            {
                break;
            }
        }
    }
}

