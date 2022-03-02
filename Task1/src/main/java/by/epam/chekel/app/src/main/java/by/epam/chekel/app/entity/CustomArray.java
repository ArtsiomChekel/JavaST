package by.epam.chekel.app.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArray {
    public static final Logger LOGGER = LogManager.getLogger();

    private int[] array;

    public CustomArray() {
        LOGGER.debug("Creating new CustomArray");
        array = new int[0];
    }

    public CustomArray(int... array) {
        LOGGER.trace("Creating new CustomArray ");
        this.array = array.clone();
    }

    public int[] getCustomArray() {
        LOGGER.trace("Creating new CustomArray ");
        return array;
    }

    public void setCustomArray(int... array) {
        this.array = array.clone();
    }

    public int length() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element + " ");
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        CustomArray arrayToEqualTo = (CustomArray) obj;
        if (arrayToEqualTo.array == null || this.array == null) {
            return arrayToEqualTo.array == null && this.array == null;
        }

        if (length() != arrayToEqualTo.length()) {
            return false;
        }

        for (int i = 0; i < length(); i++) {
            if (this.array[i] != arrayToEqualTo.array[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = this.array.hashCode();
        return hashCode;
    }
}

