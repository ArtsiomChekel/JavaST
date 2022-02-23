package com.company.chekel.task1.entity;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array)
    {
        this.array = array;
    }

    public int[] getCustomArray()
    {
        return array.clone();
    }

    public void setCustomArray(int[] array)
    {
        this.array = array;
    }
    }
