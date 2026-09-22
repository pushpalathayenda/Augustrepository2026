package com.java.Hackathon;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
  System.out.println("enter a String in capital letters");
  String s=sc.nextLine();
  String s2=s.toLowerCase();
  System.out.println("lowercase form to given String"+"\n"+s2);
  sc.close();
	}

}
