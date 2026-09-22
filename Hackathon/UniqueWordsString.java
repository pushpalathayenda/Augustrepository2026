package com.java.Hackathon;

import java.util.Scanner;

public class UniqueWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=new String(sc.nextLine());
System.out.println("given String is:"+str);
String words[]=str.split(" ");
String unique="";
//System.out.println(Arrays.toString(words));

for(String s:words)
{
	System.out.println(s);
}
int count;
for(int i=0;i<words.length;i++)
{count=0;
	for(int j=0;j<words.length;j++)
	{
	
	if(words[i].equals(words[j]))
	{count=count+1;
	
		}
	}
	if(count==1)
	unique=unique+words[i]+" ";
}
System.out.println("unique words::");

System.out.println(" "+unique);
sc.close();

	}

}
