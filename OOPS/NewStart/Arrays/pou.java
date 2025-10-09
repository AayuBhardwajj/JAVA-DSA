package NewStart.Arrays;

import java.util.Scanner;

public class pou {
         public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the " + a + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element entered at position [" + i + "] is: " + arr[i]);
        }
    }
    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {    
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int arr[], int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
