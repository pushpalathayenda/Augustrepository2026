package Assignments;

import java.util.Scanner;

public class OccurenceofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 numbers");
		int a[] = new int[7];

		for (int i = 0; i < 7; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("entered values are");
		for (int j = 0; j < 7; j++) {

			System.out.print(a[j] + " ");
		}
		for (int i = 0; i < 7; i++) {
			if (a[i] == 0) {
				break;
			}
			int c = 1;
			for (int j = i + 1; j < 6; j++) {

				if (a[j] == a[i]) {
					c = c + 1;

					for (int k = j + 1; k < 7; k++) {
						a[j] = a[j + 1];
						a[j + 1] = 0;
					}

				}
			}
			System.out.println("occurence of " + a[i] + "is" + c);
		}
	}

}
