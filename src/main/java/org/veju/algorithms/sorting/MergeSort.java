package org.veju.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[]  mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];
        System.arraycopy(arr, 0, left, 0, middle);
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        mergeArrays(left, right, arr);
        return arr;
    }
    public static void mergeArrays(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (j < right.length)
            result[k++] = right[j++];
        while (i < left.length)
            result[k++] = left[i++];
}

    public static void main(String[] args) {
        int [] arr ={4,1,2};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
