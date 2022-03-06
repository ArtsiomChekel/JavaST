package by.epam.chekel.app.repository;

import by.epam.chekel.app.entity.CustomArray;
import by.epam.chekel.app.repository.specification.CustomArrayAverageEqualsSpecification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Comparator;

public class CustomArrayRepository {
    private static CustomArrayRepository INSTANCE;
    private List<CustomArray> arrays;

    private CustomArrayRepository() {
        arrays = new ArrayList<CustomArray>();
    }

    public static CustomArrayRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomArrayRepository();
        }
        return INSTANCE;
    }

    public void set(int index, CustomArray array) {
        arrays.set(index, array);
    }

    public CustomArray get(int index) {
        return arrays.get(index);
    }

    public boolean add(CustomArray array) {
        return arrays.add(array);
    }

    public boolean remove(CustomArray array) {
        return arrays.remove(array);
    }

    public boolean addAll(Collection<? extends CustomArray> c) {
        return arrays.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return arrays.removeAll(c);
    }

    public List<CustomArray> query(CustomArrayAverageEqualsSpecification specification) {
        List<CustomArray> list = new ArrayList<>();
        for (CustomArray customArray : arrays) {
            if (specification.specify(customArray)) {
                list.add(customArray);
            }
        }
        return list;
    }

    public void sort(Comparator<CustomArray> comparator) {
        arrays.sort(comparator);
    }
}
