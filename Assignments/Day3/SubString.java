package Assignments.Day3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=new String(sc.nextLine());
		System.out.println("Enter substrig to know the index of it");
		String s1=sc.nextLine();
		//7.find the index of substring
		int index=s.indexOf(s1);
		if(index==-1)
		{
		System.out.println("sub string is not part of main string");
		}
		while(index!=-1)
		{
			System.out.println("substring found at index="+index);
	index=s.indexOf(s1, index+1);	
		}
		//8.count no of words in String
	
	String s2[]=s.split(" ");
	int count=s2.length;
		
		System.out.println("no of words in the string are"+count);
		
	//9.check two given strings are same ignoring case
		System.out.println("enter two strings");
		 String str1=sc.nextLine();
		 String str2=sc.nextLine();
		if( str1.equalsIgnoreCase(str2))
			System.out.println("both strings are same");
		else
			System.out.println("both are different strings");
	sc.close();
	}
	
	

}
