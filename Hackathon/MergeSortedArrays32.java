package com.java.Hackathon;

public class MergeSortedArrays32 {

    public static void merge(int[] A, int aCount, int[] B, int bCount) {
        int i = aCount - 1;               // last valid element in A
        int j = bCount - 1;               // last element in B
        int k = aCount + bCount - 1;      // last index of A (including buffer)

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k] = A[i];
                i--;
            } else {
                A[k] = B[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements of B (if any)
        while (j >= 0) {
            A[k] = B[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 0, 0, 0, 0};   // A has buffer space
        int[] B = {2, 4, 6, 8};

        merge(A, 4, B, 4);

        System.out.print("Merged Array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}



