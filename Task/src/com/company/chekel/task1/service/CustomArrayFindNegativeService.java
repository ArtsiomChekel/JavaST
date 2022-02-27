package com.company.chekel.task1.service;

import com.company.chekel.task1.entity.CustomArray;
import com.company.chekel.task1.exception.CustomException;

public class CustomArrayFindNegativeService {
    public int findNegativePositive(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        int tmp[] = array.getCustomArray();
        int numOfPositive = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > 0) {
                numOfPositive++;
            }
        }
        return numOfPositive;
    }

}
