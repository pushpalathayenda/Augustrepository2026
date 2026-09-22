package com.java.Hackathon;

import java.util.Scanner;

public class StringSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter a String ");
		  String s=sc.nextLine();
		 String  s2=s.substring(2,7);
		  CharSequence s3=s.subSequence(1,6);
		  
		  System.out.println("substring of s is "+s2);
		  System.out.println("subsequence of  given String"+"\n"+s3);
		  
		  String str = "ABCDEFG";

		  String part1 = str.subSequence(0, 3).toString();  // ABC
		  String part2 = str.subSequence(4, 6).toString();  // EF

		  String result = part1 + part2;

		  System.out.println(result);
		  //substring:continuous part of the string
		  //CharSequence
	
		  //subsequence:part of the string in order but can have gaps.
	sc.close();
	}
	

}
