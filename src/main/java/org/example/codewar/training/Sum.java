package org.example.codewar.training;

/*
   Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return it.

   If the two numbers are equal return a or b.

   Note: a and b are not ordered!
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(GetSum(1, 5));
    }

    public static int GetSum(int a, int b) {
        if (a == b) {
            return b;
        }
        int sum = 0;
        int max = a;
        int min = a;
        if (b > a) {
            max = b;
        } else {
            min = b;
        }
        for (; min <= max; min++) {
            sum = sum + min;
        }
        return sum;
    }
}
