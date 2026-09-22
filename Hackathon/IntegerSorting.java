package com.java.Hackathon;

import java.util.Scanner;

public class IntegerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a[]=new int[sc.nextInt()];
		System.out.println("enter the elements into Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Integer Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int l=a.length;
		int p = 0;
		for (int i = 0; i < l; i++) {

			for (int j =1; j<=(l-1); j++) {
				if (a[j] < a[j - 1]) {
					p = a[j - 1];
					a[j - 1] = a[j];
					a[j] = p;
				}

			}
		}
		System.out.println(" Ascending ordered Array is: ");
		for (int k = 0; k <l; k++) {
			System.out.println(a[k]);
		}
		
				
			
	sc.close();
	}
	

}
