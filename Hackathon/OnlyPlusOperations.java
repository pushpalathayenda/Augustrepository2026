package com.java.Hackathon;

		public class OnlyPlusOperations {

		    // Create negative of a number using only +
		    public static int negate(int x) {
		        int neg = 0;
		        int step = x > 0 ? -1 : 1;  // move toward zero//ternary operator

		        while (x != 0) {
		            neg = neg + step;
		            x = x + step;
		        }
		        return neg;
		    }

		    // Subtraction using only +
		    public static int subtract(int a, int b) {
		        return a + negate(b);
		    }

		    // Multiplication using only +
		    public static int multiply(int a, int b) {
		        int result = 0;

		        boolean negative = false;

		        if (b < 0) {
		            b = negate(b);
		            negative = !negative;
		        }
		        if (a < 0) {
		            a = negate(a);
		            negative = !negative;
		        }

		        while (b > 0) {
		            result = result + a;
		            b = b + negate(1);  // subtract 1 using only +
		        }

		        return negative ? negate(result) : result;
		    }

		    // Division using only +
		    public static int divide(int a, int b) {
		        if (b == 0) throw new ArithmeticException("Divide by zero");

		        boolean negative = false;

		        if (a < 0) {
		            a = negate(a);
		            negative = !negative;
		        }
		        if (b < 0) {
		            b = negate(b);
		            negative = !negative;
		        }

		        int count = 0;

		        while (a >= b) {
		            a = subtract(a, b);  // uses only +
		            count = count + 1;
		        }

		        return negative ? negate(count) : count;
		    }

		    public static void main(String[] args) {
		        System.out.println("Subtract 10 - 3 = " + subtract(10, 3));
		        System.out.println("Multiply 4 * -3 = " + multiply(4, -3));
		        System.out.println("Divide 20 / 5 = " + divide(20, 5));
		    }
		

	}


