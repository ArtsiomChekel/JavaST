package by.epam.chekel.app.repository.specification;

import by.epam.chekel.app.entity.CustomArray;

public class CustomArrayAverageEqualsSpecification {
    private double numberToCompare;

    public CustomArrayAverageEqualsSpecification(double numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    public boolean specify(CustomArray array) {
        if (array == null || array.length() == 0) {
            return false;
        }

        boolean result = false;
        double sum = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            sum += array.getElement(i);
        }

        result = numberToCompare == sum / array.length();

        return result;
    }
}
