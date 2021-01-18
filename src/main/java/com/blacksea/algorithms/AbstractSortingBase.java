package com.blacksea.algorithms;

import java.util.Arrays;

public abstract class AbstractSortingBase {
    public int[] array;

    public AbstractSortingBase(int[] array) {
        this.array = array;
    }

    public abstract void sort();

    protected void print() {
        System.out.println(Arrays.toString(array));
    }
}
