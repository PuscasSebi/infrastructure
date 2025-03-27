package com.puscas.accounts;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Adds two numbers together.
     *
     * @param a
     *            first number
     * @param b
     *            second number
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));

        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param a
     *            first number
     * @param b
     *            second number
     * @return the difference of a and b
     */
    public static int subtract(int a, int b) {
        System.out.println("Difference of " + a + " and " + b + " is " + (a - b));
        return a - b;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param a
     *            first number
     * @param b
     *            second number
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        System.out.println("Product of " + a + " and " + b + " is " + (a * b));
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param a
     *            first number
     * @param b
     *            second number
     * @return the quotient of a and b
     */
    public static int divide(int a, int b) {
        return a / b;
    }

}
