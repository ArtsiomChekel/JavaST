package by.epam.chekel.app.comparator;

import by.epam.chekel.app.entity.CustomArray;

public class CustomArrayIdComparator {
    public int compare(CustomArray firstArray, CustomArray secondArray){
        return Integer.compare(firstArray.getId(), secondArray.getId());
    }
}
