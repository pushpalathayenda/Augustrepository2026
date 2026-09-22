package com.java.Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter a String ");
		  String s=sc.nextLine();
		  String s1[]=s.split(" ");
		  System.out.println(Arrays.toString(s1));
		  for(String s2:s1)
			  System.out.println(s2);
		sc.close();
	}

}
