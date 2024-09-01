package org.example.codewar.training;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.

The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
 */
public class FindOutlier {

    public static void main(String[] args) {
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
    }

    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        boolean majorityIsEven = evenCount > oddCount;
        int result = integers[0];
        for (int integer : integers) {
            if ((majorityIsEven && integer % 2 != 0) || (!majorityIsEven && integer % 2 == 0)) {
                result = integer;
            }
        }
        return result;
    }
}
