package com.main;

public class Quicksort {
    private void swap (int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = temp;
        arr[r] = temp;
    }

    /*
     * select pivot
     * all elements less than or equal to pivot on left side of pivot
     * all elements greater than pivot on right side of pivot
     */
    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);
        return i+1;
    }

    public void quickSort(int[] input, int l, int r) {
        if (l < r) {
            int pi = partition(input, l, r);
            quickSort(input, l, pi - 1);
            quickSort(input, pi+1, r);
        }
    }
}
