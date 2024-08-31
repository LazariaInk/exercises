package org.example.codewar.training;

/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
 */
public class SquareDigit {

    public static void main(String[] args) {
        int resul = squareDigits(234);
    }


    public static int squareDigits(int n) {
        StringBuilder squareNumbers = new StringBuilder("");
        for(int i = 0; i < String.valueOf(n).length(); i ++){
            int intValue = Integer.parseInt(String.valueOf(n).substring(i, i + 1));
            int squareValue = intValue* intValue;
            squareNumbers.append(squareValue);
        }
        return Integer.parseInt(squareNumbers.toString());
    }
}
