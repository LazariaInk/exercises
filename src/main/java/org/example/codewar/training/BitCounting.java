package org.example.codewar.training;

/*
   Write a function that takes an integer as input,
and returns the number of bits that are equal to one in the binary representation of that number.

You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(23));
    }

    public static int countBits(int n) {
        int numberToDevide = n;
        StringBuilder numberInBinary = new StringBuilder();
        int result = 0;
        while (numberToDevide > 0) {
            numberInBinary.append(numberToDevide % 2);
            numberToDevide = numberToDevide / 2;
        }
        for (char digit : numberInBinary.toString().toCharArray()) {
            if (digit == '1') {
                result= result + 1;
            }
        }
        System.out.println(numberInBinary);
        return result;
    }
}
