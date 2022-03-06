package by.epam.chekel.app.service;

import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayChangeService {
    public static final Logger LOGGER = LogManager.getLogger();


    public void changeElementNegativeIntoZero(CustomArray array) throws CustomException {
        LOGGER.info("ChangeElementNegativeIntoZero");
        if (array == null || array.length() == 0) {
            throw new CustomException("Array is null or length is 0");
        }
        int[] tmpArray = array.getCustomArray();
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] < 0) {
                tmpArray[i] = 0;
            }
        }
    }
}
