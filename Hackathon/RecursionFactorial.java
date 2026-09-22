package com.java.Hackathon;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println("enter a number to find out factorial if a number");
Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				 long f=Fact(num);
				 System.out.println("factorial of "+num+"is:"+f);
				
				sc.close();

			}
			public static long Fact(int n)
			{
				if(n==1)
				
				{
					return 1;
				}
				else
				{
					return n*Fact(n-1);
					
				}
			}
			

		}

	

