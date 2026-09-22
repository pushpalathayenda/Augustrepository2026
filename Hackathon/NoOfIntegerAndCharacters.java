package com.java.Hackathon;

import java.util.Scanner;

public class NoOfIntegerAndCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int repeatedDigits = 0;
        int repeatedUpper = 0;
        int repeatedLower = 0;

        String checked = "";   // to avoid counting same character again

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // skip if already processed
            if (checked.indexOf(ch) != -1) {
                continue;
            }

            int count = 0;

            // count occurrences
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // if repeated
            if (count > 1) {

                if (ch >= '0' && ch <= '9') {
                    repeatedDigits++;
                } 
                else if (ch >= 'A' && ch <= 'Z') {
                    repeatedUpper++;
                } 
                else if (ch >= 'a' && ch <= 'z') {
                    repeatedLower++;
                }
            }

            checked += ch;  // mark as processed
        }

        System.out.println("Repeated digits: " + repeatedDigits);
        System.out.println("Repeated uppercase letters: " + repeatedUpper);
        System.out.println("Repeated lowercase letters: " + repeatedLower);

        sc.close();
    }
}
