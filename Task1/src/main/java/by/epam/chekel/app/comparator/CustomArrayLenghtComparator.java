package by.epam.chekel.app.comparator;

import by.epam.chekel.app.entity.CustomArray;

public class CustomArrayLenghtComparator {

    public int compare(CustomArray firstArray, CustomArray secondArray) {
        int answer = 0;
        if (firstArray.length() > secondArray.length()) {
            answer = 1;
        } else if (firstArray.length() < secondArray.length()) {
            answer = -1;
        }
        return answer;
    }
}
