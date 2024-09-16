package org.example.codewar.training;

/*
Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.
 */
public class PrimeDecomp {
    public static void main(String[] args) {
        System.out.println(factors(86240));
    }

    public static String factors(int n) {
        StringBuilder result = new StringBuilder();
        int count;
        for (int i = 2; i <= n; i++) {
            count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                result.append("(").append(i);
                if (count > 1) {
                    result.append("**").append(count);
                }
                result.append(")");
            }
        }

        return result.toString();
    }
}

