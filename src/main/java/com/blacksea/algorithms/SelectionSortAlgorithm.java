package com.blacksea.algorithms;

/**
 * Starts first index of array. Swaps that item with smaller items of itself
 */
public class SelectionSortAlgorithm extends AbstractSortingBase {

    public SelectionSortAlgorithm(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length -1; i++) {
            int swapEleIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[swapEleIndex]) {
                    swapEleIndex = j;
                }
            }
            int tmp = array[swapEleIndex];
            array[swapEleIndex] = array[i];
            array[i] = tmp;
        }
        print();
    }
}
