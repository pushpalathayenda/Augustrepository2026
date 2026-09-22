package com.java.Hackathon;

import java.util.Scanner;

public class BooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if at least two out of three Booleans are true
		Scanner sc=new Scanner(System.in);
		boolean a=false,b=false,c=false;
		System.out.println("enter true or false to a variables a,b,c");
	
		a=sc.nextBoolean();
		b=sc.nextBoolean();
		c=sc.nextBoolean();
		if((a&&b)||(b&c)||(a&c))
			System.out.println("atleast 2 of three booleans have true value");
		else
			System.out.println("none of them is true boolean");
			
		
sc.close();
		
	}

}
