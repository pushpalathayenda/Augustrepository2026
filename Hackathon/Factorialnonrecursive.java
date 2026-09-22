package com.java.Hackathon;

import java.util.Scanner;

public class Factorialnonrecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to find out  factorial of it");
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		int k=1;
		for(int j=i;j>=1;j--)
		{
			k=k*j;	
		}
			System.out.println("factiroal  of  " +i+" is ="+k);
			
		sc.close();
	}

}
