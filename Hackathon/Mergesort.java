package com.java.Hackathon;

public class Mergesort {

		// TODO Auto-generated method stub
	    // Main merge sort function (recursive)
		    public static void mergeSort(int[] arr, int left, int right) {
		        if (left < right) {
		            int mid = (left + right) / 2;

		            // Sort left half
		            mergeSort(arr, left, mid);

		            // Sort right half
		            mergeSort(arr, mid + 1, right);

		            // Merge the two halves
		            merge(arr, left, mid, right);
		        }
		    }

		    // Merge two sorted halves
		    public static void merge(int[] arr, int left, int mid, int right) {
		        int n1 = mid - left + 1;     // size of left half
		        int n2 = right - mid;        // size of right half

		        int[] L = new int[n1];
		        int[] R = new int[n2];

		        // Copy data to temp arrays
		        for (int i = 0; i < n1; i++)
		            L[i] = arr[left + i];

		        for (int i = 0; i < n2; i++)
		            R[i] = arr[mid + 1 + i];

		        int i = 0, j = 0, k = left;

		        // Merge the temp arrays back into arr
		        while (i < n1 && j < n2) {
		            if (L[i] <= R[j]) {
		                arr[k] = L[i];
		                i++;
		            } else {
		                arr[k] = R[j];
		                j++;
		            }
		            k++;
		        }

		        // Copy remaining elements of L[]
		        while (i < n1) {
		            arr[k] = L[i];
		            i++;
		            k++;
		        }

		        // Copy remaining elements of R[]
		        while (j < n2) {
		            arr[k] = R[j];
		            j++;
		            k++;
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {5, 2, 9, 1, 3, 7};

		        mergeSort(arr, 0, arr.length - 1);

		        // Print sorted array
		        for (int num : arr)
		            System.out.print(num + " ");
		    }
		

	}


