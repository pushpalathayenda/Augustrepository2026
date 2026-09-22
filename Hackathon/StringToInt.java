package com.java.Hackathon;

import java.util.Scanner;

public class StringToInt extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String value1="100";
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		try
		{
		String value1=sc.nextLine();
		int p=Integer.parseInt(value1);
		System.out.println("converting String"+value1+" to integer"+p);
		System.out.println("sum of two numbers::"+(p+300));

		
		}
		catch(Exception e)
		{
			System.out.println("enter String with numbers "+e);
		}
		
	sc.close();	
		
	}

}
