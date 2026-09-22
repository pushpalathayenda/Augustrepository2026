package com.java.Hackathon;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s2.equalsIgnoreCase(s1))
		{
			System.out.println("given String  is a palandrome number");
		}
		else
			System.out.println("given String is not a palandrome");
	
	System.out.println("enter a number to check palandrome or not");
	int num=sc.nextInt();
	int temp=num;
	int rev=0;
	while(temp!=0)
	{
		rev=rev*10+temp%10;
		temp=temp/10;

	}

	if(rev==num)
	{
		System.out.println("given number is palandrome");
	}
	else 
		System.out.println("not a palandrome");
	sc.close();
	}
	
	

}
