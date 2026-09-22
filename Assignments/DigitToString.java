package Assignments;

import java.util.Scanner;

public class DigitToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
int n =sc.nextInt();
String s=String.valueOf(n);//convert integer to String 1254
/*int p=2;
System.out.println(s.charAt(p));*/
StringBuilder sb=new StringBuilder("1346");
sb.setCharAt(0, '2');
System.out.println(sb);

System.out.println(s);
for(int i=0;i<sb.length();i++)//length is 4
{char ch=sb.charAt(i);//1
	switch(ch)
	{
	case '0':System.out.print("zero  " );
	break;
	case '1':System.out.print("one  ");//print one
	break;
	case '2':System.out.print("Two  ");//print Two
	break;
	case '3':System.out.print("Three  ");
	break;
	case '4':System.out.print("Four  ");
	break;
	case '5':System.out.print("Five  ");
	break;
	case '6':System.out.print("Six  ");
	break;
	case '7':System.out.print("Seven  ");
	break;
	case '8':System.out.print("Eight  ");
	break;
	case '9':System.out.print("Nine  ");
	break;
	
	}
	
	
	}

sc.close();
	}

}
