package com.java.Hackathon;

public class Reversebygroup {

		    public static void reverseK(int[] arr, int k) {
		        for (int i = 0; i < arr.length; i += k) {
		            int start = i;
		            int end = Math.min(i + k - 1, arr.length - 1);

		            // Only reverse if we have full k elements
		            if (end - start + 1 == k) {
		                while (start < end) {
		                    int temp = arr[start];
		                    arr[start] = arr[end];
		                    arr[end] = temp;
		                    start++;
		                    end--;
		                }
		            }
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {3,2,4,7,0,3,1,5,8,4};
		        int k = 3;

		        reverseK(arr, k);

		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		

	}


