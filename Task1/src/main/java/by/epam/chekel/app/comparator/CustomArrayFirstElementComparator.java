package by.epam.chekel.app.comparator;

import by.epam.chekel.app.entity.CustomArray;

public class CustomArrayFirstElementComparator {
    
    public int compare(CustomArray firstArray, CustomArray secondArray) {
        int answer = 0;
        if (firstArray.length() == 0 && secondArray.length() != 0) {
            answer = -1;
        } else if (secondArray.length() == 0 && firstArray.length() != 0) {
            answer = 1;
        } else if (secondArray.length() == 0 && firstArray.length() == 0) {
            answer = 0;
        } else {
            if (firstArray.getElement(0) > secondArray.getElement(0)) {
                answer = 1;
            } else if (firstArray.getElement(0) < secondArray.getElement(0)) {
                answer = -1;
            }
        }

        return answer;
    }
}
