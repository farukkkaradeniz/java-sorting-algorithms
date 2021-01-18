package com.blacksea.algorithms;

import java.util.Arrays;

/**
 * Bubble sort algorithm takes an array as input. Starts first index of array and iterates that value to end of array until
 * smaller than next item of array. If next item is bigger than current item then starts to iterate bigger value until end of the array
 */
public class BubbleSortAlgorithm extends AbstractSortingBase {
    public BubbleSortAlgorithm(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        print();
    }
}
