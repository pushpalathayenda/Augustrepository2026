package com.java.Hackathon;

import java.util.Scanner;

public class UniqueNumbers {

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
		System.out.println("unique elements");
		
		for(int i=0;i<a.length;i++)
		{
	int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{count++;
				
				}
				
			}
			if(count ==1)
			System.out.println(a[i]);
			}
		int l=a.length;
		boolean b[]=new boolean[l];
//occurance of duplicate integers
		System.out.println("occurance of duplicate value");
		for(int i=0;i<l;i++)
		{int count=1;
			if(b[i])continue;
			for(int j=i+1;j<l;j++)
			{
				if(a[i]==a[j])
				{count=count+1;
					System.out.println(a[i]);
				b[j]=true;
				}
			}
				
				if(count >1)  
				{
	                System.out.println(a[i] + " occurs " + count + " times");
	            }
	        }

	        sc.close();
	    }
	}	
				