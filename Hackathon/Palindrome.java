package com.java.Hackathon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a[]=new int[sc.nextInt()];
		System.out.println("enter the elements into Array");
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Integer Array");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		boolean s=true;
		for(int i=0;i<l/2;i++)
		{
			if(a[i]!=a[l-1-i])
			{
				s=false;
				break;
			}
		
		}
		if(s)
			System.out.println("given Array is palindrome");
		else
			System.out.println("given Array is not a palindrome");
sc.close();
}
}

