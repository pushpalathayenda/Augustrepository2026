package Assignments.Day2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a[] = new int[6];
				Scanner sc = new Scanner(System.in);
				System.out.println("enter  6 number  in to the array");
				for (int i = 0; i < 6; i++) {
					a[i] = sc.nextInt();
				}
				
				String s;

				System.out.println("Array is: ");
				for (int i = 0; i < 6; i++) {
					System.out.println(a[i]);
				}
				int p = 0;
				for (int i = 0; i < 6; i++) {

					for (int j = 1; j <= (6 - 1); j++) {
						if (a[j] < a[j - 1]) {
							p = a[j - 1];
							a[j - 1] = a[j];
							a[j] = p;
						}

					}
				}
				System.out.println(" Ascending ordered Array is: ");
				for (int k = 0; k < 6; k++) {
					System.out.println(a[k]);
				}
				
				
				sc.close();
				
			}

		


	}


