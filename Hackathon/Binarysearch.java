package com.java.Hackathon;

import java.util.Scanner;

class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];   // array size = 5

        System.out.println("Enter 5 sorted binary elements (0 or 1):");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();   // user input
        }

        System.out.print("Enter element to search (0 or 1): ");
        int target = sc.nextInt();

        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}


	


