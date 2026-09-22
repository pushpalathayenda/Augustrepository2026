package Assignments.Day2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  6 numbers  in to the array");
		for (int i = 0; i < 6; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array is: ");
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
		System.out.println("enter a number to search?");
		int key = sc.nextInt();
		int j = 0;
		for (int i = 0; i < 6; i++) {

			if (a[i] == key) {
				j = j + 1;

			}

		}
		System.out.println("number found " + j + " times");
		sc.close();
	}
}
