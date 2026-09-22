package com.java.Hackathon;

import java.util.Scanner;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
String s1="pushpa";
String s2=sc.nextLine();
String s3=new String("latha");
char s[]={'j','a','v','a'};
String s4=new String(s);

StringBuilder s5=new StringBuilder("programming");
String s6=String.valueOf(100);
System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
 
sc.close();
	}

}
