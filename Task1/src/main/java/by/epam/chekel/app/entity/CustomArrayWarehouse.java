package by.epam.chekel.app.entity;

import by.epam.chekel.app.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CustomArrayWarehouse {
    private static final Logger LOGGER = LogManager.getLogger();
    private static CustomArrayWarehouse INSTANCE;
    private Map<Integer, CustomArrayParameters> customArrayValuesMap;

    public CustomArrayWarehouse() {
        customArrayValuesMap = new HashMap<>();
    }

    public static CustomArrayWarehouse getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomArrayWarehouse();
        }
        return INSTANCE;
    }

    public Map<Integer, CustomArrayParameters> getCustomArrayValuesMap() {
        return customArrayValuesMap;
    }

    public void setCustomArrayValuesMap(Map<Integer, CustomArrayParameters> customArrayValuesMap) throws CustomException {
        if (customArrayValuesMap == null) {
            LOGGER.error("Null pointer");
            throw new CustomException("Null pointer");
        }
        this.customArrayValuesMap = customArrayValuesMap;
    }

    public void put(Integer id, CustomArrayParameters customArrayValues) throws CustomException {
        if (customArrayValues == null) {
            LOGGER.error("Null pointer");
            throw new CustomException("Null pointer");
        }
        customArrayValuesMap.put(id, customArrayValues);
    }

    public void remove(Integer id) {
        customArrayValuesMap.remove(id);
    }

    public CustomArrayParameters get(Integer id) throws CustomException {
        CustomArrayParameters customArrayParameters = customArrayValuesMap.get(id);
        if (customArrayParameters == null) {
            LOGGER.error("CustomArrayValues is null");
            throw new CustomException("CustomArrayValues is null");
        }
        return customArrayParameters;
    }
}
