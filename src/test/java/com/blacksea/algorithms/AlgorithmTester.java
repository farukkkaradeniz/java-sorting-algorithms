package com.blacksea.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmTester {
    int arr[] = {4,3,5,2,1};
    int assertArr[] = {1,2,3,4,5};

    @Test
    public void bubbleSort() {
        BubbleSortAlgorithm bsa = new BubbleSortAlgorithm(arr);
        bsa.sort();
        Assert.assertArrayEquals(bsa.array,assertArr);
    }

    @Test
    public void selectionSort() {
        SelectionSortAlgorithm bsa = new SelectionSortAlgorithm(arr);
        bsa.sort();
        Assert.assertArrayEquals(bsa.array,assertArr);
    }

    @Test
    public void insertionSort() {
        InsertionSortAlgorithm insertionSortAlgorithm = new InsertionSortAlgorithm(arr);
        insertionSortAlgorithm.sort();
        Assert.assertArrayEquals(insertionSortAlgorithm.array,assertArr);
    }

    @Test
    public void mergeSort() {

    }

    @Test
    public void quickSort() {

    }
}
