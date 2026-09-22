package com.java.Hackathon;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter a String in small letters");
		  String s=sc.nextLine();
		  String s2=s.toUpperCase();
		  System.out.println("uppercase form to given String"+"\n"+s2);
		  sc.close();
	}

}
