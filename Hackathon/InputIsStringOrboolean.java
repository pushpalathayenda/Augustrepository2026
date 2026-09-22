package com.java.Hackathon;

import java.util.Scanner;

public class InputIsStringOrboolean {
	  // Method to check integer
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Method to check boolean
    public static boolean isBoolean(String s) {
        return s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String or boolean or integer");
String s1=sc.nextLine();
 if (isInteger(s1)) {
            System.out.println("Input is an Integer");
        }
        // Check for Boolean
        else if (isBoolean(s1)) {
            System.out.println("Input is a Boolean");
        }
        // Otherwise String
        else {
            System.out.println("Input is a String");
        }

        sc.close();
    }

  
}

	


