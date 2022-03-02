package by.epam.chekel.app.creator;

import by.epam.chekel.app.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCreator {
    static Logger LOGGER = LogManager.getLogger();

    public CustomArray createCustomArray(int[] array)
    {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }
}
