package Assignments.Day3;

import java.util.Scanner;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[8];
Scanner sc=new Scanner(System.in);
System.out.println("enter 4 numbers");
String s1="";
String s2=null;
//1.COnverting  integer array to String
for(int i=0;i<4;i++)
{
	a[i]=sc.nextInt();
	s1= s1+a[i];
	
}
System.out.println("Array to String");
System.out.println(s1);
//String value1 ="welcome";
String value1="100";
//2.Convert String to integer
System.out.println("converting String 100 to integer"+Integer.parseInt(value1));




s2=s1+" four numbers"+""
		+ "  become String";
System.out.println(s2);
//2.Strign to Interger
System.out.println(s1.charAt(1));
int b[]=new int[s1.length()];
for(int i=0;i<s1.length();i++)
{
b[i]=s1.charAt(i)-'0';//Asci code of char -ascii value of '0' that is 48 gives actual interger value

}
System.out.println("Integer Array");
for(int i=0;i<b.length;i++)
	System.out.print(b[i]+" ");
System.out.println();
//3.convert integer to String
int num=897;
Integer n=new Integer(num);
String m=n.toString();
System.out.println("convert integer(897)to string "+m);
	
//4.covert String to char Array
	String str="welcome to java";
	char ch[]=new char[str.length()];
	System.out.println("String//"+str+"// to Character array ");
	for(int j=0;j<str.length();j++)
	{
		ch[j]=str.charAt(j);
		System.out.print(ch[j]+" ");
	}
	System.out.println();
	
//5.find a character at a location 
	
	System.out.println("Enter the index number to fetch the character in the String"+"("+str+")");
	int p=sc.nextInt();
	System.out.println("char at the given index is="+str.charAt(p));
	sc.close();
}
	
}

