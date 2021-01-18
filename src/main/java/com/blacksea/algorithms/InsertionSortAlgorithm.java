package com.blacksea.algorithms;

/**
 * 
 */
public class InsertionSortAlgorithm extends AbstractSortingBase{
    public InsertionSortAlgorithm(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        print();
    }
}
