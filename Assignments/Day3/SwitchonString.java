package Assignments.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchonString {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");

String str=sc.nextLine();
		System.out.println("select one option");
		System.out.println("1.remove given charaters");
		System.out.println("2.Remove Space");
		System.out.println("3.Captalize the first letter of each word in String");
		System.out.println("4.Find all substrings of given String");
	System.out.println("5.check given text is a rotation of another text");
	int i=sc.nextInt();
		

switch(i)
{case 1:System.out.println("choose a word from string to remove");
        String s=sc.next();
           if(str.contains(s)) 
        	 str=str.replace(s, "");
            System.out.println("updated String is ::"+str);
           break;
case 2:str=str.trim();
         String str1=str.replace(" ","" );
        System.out.println("String after removing Spaces in it"+str1);
	break;
case 3:
	  String s1[]=str.split(" ");
	  System.out.println(Arrays.toString(s1));
	  for(int j = 0; j < s1.length; j++) {
		    String word = s1[j];
		    if(word.length() > 0) {
		        s1[j] = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		    }
		}
	  System.out.println("after case convestion"+Arrays.toString(s1));

}
sc.close();

	}

}
