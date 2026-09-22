package com.java.Hackathon;

import java.util.Scanner;

public class LagestpalindrominString {

    // Method to find longest palindrome
    public static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // odd length palindrome
            String p1 = expand(s, i, i);

            // even length palindrome
            String p2 = expand(s, i, i + 1);

            // update longest
            if (p1.length() > longest.length()) longest = p1;
            if (p2.length() > longest.length()) longest = p2;
        }

        return longest;
    }

    // Expand around center
    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Largest Palindrome: " + longestPalindrome(s));
        sc.close();
    }
}
