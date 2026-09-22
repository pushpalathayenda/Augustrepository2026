package com.java.Hackathon;

import java.util.Scanner;

public class AscendingorderSelectiosort {

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
		for(int i=0;i<l-1;i++)
		{int k=i;
			for(int j=i+1;j<l;j++)
			{
				if(a[j]<a[k])
				{
					k=j;
				}
				
			}
			int m=a[i];
			a[i]=a[k];
			a[k]=m;
			
		}
		System.out.println("ascending order sorting using selection sort");
		for(int i=0;i<l;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
