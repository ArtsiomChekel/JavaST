package com.company.chekel.task1.service;

import com.company.chekel.task1.exception.CustomException;
import com.company.chekel.task1.entity.CustomArray;

public class CustomArrayMinMaxService {

    public int findMaxValue(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        array.getCustomArray();
        int tmp[] = array.getCustomArray();
        int maxValue = tmp[0];
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > maxValue) {
                maxValue = tmp[i];
            }
        }
        return maxValue;
    }

    public int findMinValue(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        int tmp[] = array.getCustomArray();
        int minValue = tmp[0];
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] < minValue) {
                minValue = tmp[i];
            }
        }
        return minValue;
    }
}
