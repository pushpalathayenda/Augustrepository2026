package com.java.Hackathon;

import java.util.Scanner;

public class OccuranceOfLetters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
 String str=sc.nextLine();
String s2="";
System.out.println(" occurance of each character in  given String");
for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);

// Skip if already added to s2
if (s2.indexOf(ch) != -1)//It returns the index (position) where the character first appears.
{
    continue;
}
	int count=0;
	
	for(int j=0;j<str.length();j++)
	{
	
		
		if(str.charAt(j)==ch)
		{
			count=count+1;
			
		}
	}
	if(count>1)
	{
		System.out.println("ocuuranc of "+ch+ "=" +count);
	s2=s2+ch;
	}
}
System.out.println(s2);
sc.close();
	}

}
	
		