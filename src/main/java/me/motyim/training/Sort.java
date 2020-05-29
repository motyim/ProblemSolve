package me.motyim.training;

import java.util.Arrays;

public class Sort {

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    public void mergeSort(int arr[]){
        mergeSortHelper(arr,0,arr.length);
    }

    private void mergeSortHelper(int[] arr, int l, int r) {
        if(l<r){
            int m = (l+r)/2;
            mergeSortHelper(arr,l,m);
            mergeSortHelper(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i = 0; i < n1; i++) {
            L[i]=arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m+1+i];
        }

        int i = 0 , j = 0;
        int k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{4, 6, 2, 1, 7, 8, 5};
//        new Sort().bubbleSort(arr);
//        new Sort().selectionSort(arr);
        new Sort().insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
