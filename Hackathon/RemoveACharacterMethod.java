package com.java.Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveACharacterMethod {
	public String removeCharacter(String str,int index)
	{
		char c= str.charAt(index);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c)
				sb=sb.append(str.charAt(i));
		}
		return sb.toString();
			
			}
		
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String");
	String s=new String(sc.nextLine());
	System.out.println("enter a index of char to remove from string");
int i=sc.nextInt();
	RemoveACharacterMethod rm=new RemoveACharacterMethod();
	String newstring=rm.removeCharacter(s,i);
System.out.println("String without spaces in between::"+"\n"+newstring);
	sc.close();
}



}
