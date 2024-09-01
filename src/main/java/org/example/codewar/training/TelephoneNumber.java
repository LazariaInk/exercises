package org.example.codewar.training;

/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!
 */
public class TelephoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        String telephoneFormatPattern = "(xxx) xxx-xxxx";
        int expectedLength = 10;
        if (numbers.length != expectedLength) {
            throw new IllegalArgumentException("Please enter 10 digit number");
        }
        int indexForX = 0;
        char[] telephoneNumberInCorrectFormatArray = telephoneFormatPattern.toCharArray();

        for (int i = 0; i < telephoneNumberInCorrectFormatArray.length; i++) {
            if (telephoneNumberInCorrectFormatArray[i] == 'x') {
                telephoneNumberInCorrectFormatArray[i] = Character.forDigit(numbers[indexForX], 10);
                indexForX++;
            }
        }
        return String.valueOf(telephoneNumberInCorrectFormatArray);
    }
}
