package by.epam.chekel.app.service;


import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.exception.CustomException;

public class CustomArraySortService {

    public void insertionSort(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        int[] tmpArray = array.getCustomArray();
        for (int i = 1; i < tmpArray.length; i++) {
            int helpValue = tmpArray[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (helpValue < tmpArray[j]) {
                    tmpArray[j + 1] = tmpArray[j];
                } else {
                    break;
                }
            }
            tmpArray[j + 1] = helpValue;
        }
    }

    public void exchangeSort(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        int[] tmpArray = array.getCustomArray();
        int helpValue = 0;
        while (true) {
            int countOfChanges = 0;
            for (int i = 0; i < tmpArray.length - 1; i++) {
                if (tmpArray[i] > tmpArray[i + 1]) {
                    helpValue = tmpArray[i];
                    tmpArray[i] = tmpArray[i + 1];
                    tmpArray[i + 1] = helpValue;
                    countOfChanges++;
                }
            }
            if (countOfChanges == 0) {
                break;
            }
        }
    }

    public void shellSort(CustomArray array) throws CustomException {
        if (array == null || array.length() == 0) {

            throw new CustomException("Array is null or length is 0");
        }
        int[] tmpArray = array.getCustomArray();
        int helpValue = 0;
        int i = 0;
        while (true) {
            if (tmpArray[0] > tmpArray[1]) {
                helpValue = tmpArray[0];
                tmpArray[0] = tmpArray[1];
                tmpArray[1] = helpValue;
            }
            if (tmpArray[i] > tmpArray[i + 1]) {
                helpValue = tmpArray[i];
                tmpArray[i] = tmpArray[i + 1];
                tmpArray[i + 1] = helpValue;
                i--;
            } else {
                i++;
            }
            if (i > tmpArray.length - 2) {
                break;
            }
        }
    }
}

