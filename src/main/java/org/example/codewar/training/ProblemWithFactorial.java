package org.example.codewar.training;

/*
Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 *  ... * N

Be careful 1000! has 2568 digits...
 */
public class ProblemWithFactorial {

    public static void main(String[] args) {
        System.out.println(zero(60));
    }

    public static int zeros(int n) {
        int result = 0;
        while (n > 1) {
            n = n / 5;
            result++;
        }
        return result;
    }

    public static int zero(int n){
        int result = 0;
        while (n > 0) {
            n = n / 5;
            result += n;
        }
        return result;
    }

}
