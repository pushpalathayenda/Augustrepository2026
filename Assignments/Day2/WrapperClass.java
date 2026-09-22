package Assignments.Day2;

import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
String s1,s2;
float numfloat;

Scanner sc=new Scanner(System.in);
System.out.println("enter a and b  values ineger value");
 a=sc.nextInt();
 b=sc.nextInt();
 System.out.println("Enter a String");
 s2=sc.next();
System.out.println("String concatination="+(s2+10));
//coverting int to Integer object
Integer I=new Integer(a);

Integer I2=new Integer(b);
//Max of two integers
System.out.println("max of a and b is ="+(Integer.max(I,I2)));
//covertign Integer String 
s1=I.toString();
System.out.println("String form of Integer="+s1);
System.out.println("String length ="+s1.length());
//converting String to integer
int i=Integer.parseInt(s2);
System.out.println("Integer form for string 89=="+i);
System.out.println(i+45);
//float variable can hold integer
numfloat=a;
System.out.println("float value of integer"+numfloat);
System.out.println("Integer a="+a);
//min of float numbers
System.out.println("minimum of given float values= "+Float.min(34.5f,89.0f));



	}

}
