package by.epam.chekel.app.service;

import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomFindService {
    public static final Logger LOGGER = LogManager.getLogger();

    public int findMinValue(CustomArray array) throws CustomException {
        LOGGER.info("FindMinValue");
        if (array == null || array.length() == 0) {
            throw new CustomException("Array is null or length is 0");
        }
        int tmpArray[] = array.getCustomArray();
        int minValue = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] < minValue) {
                minValue = tmpArray[i];
            }
        }
        return minValue;
    }

    public int findMaxValue(CustomArray array) throws CustomException {
        LOGGER.info("FindMaxValue");
        if (array == null || array.length() == 0) {
            throw new CustomException("Array is null or length is 0");
        }
        int tmpArray[] = array.getCustomArray();
        int maxValue = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > maxValue) {
                maxValue = tmpArray[i];
            }
        }
        return maxValue;
    }

    public int findNumberOfPositiveValues(CustomArray array) throws CustomException {
        LOGGER.info("FindNumberOfPositiveValues");
        if (array == null || array.length() == 0) {
            throw new CustomException("Array is null or length is 0");
        }
        int tmpArray[] = array.getCustomArray();
        int numOfPositive = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > 0) {
                numOfPositive++;
            }
        }
        return numOfPositive;
    }

    public double findAverageValue(CustomArray array) throws CustomException {
        LOGGER.info("FindAverageValue");
        if (array == null || array.length() == 0) {
            throw new CustomException("Array is null or length is 0");
        }
        int[] tmpArray = array.getCustomArray();
        int summ = 0;
        for (int i = 0; i < tmpArray.length; i++)
            summ += tmpArray[i];

        double averageValue = summ / (tmpArray.length);
        return averageValue;
    }
}
