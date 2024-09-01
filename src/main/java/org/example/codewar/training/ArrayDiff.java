package org.example.codewar.training;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class ArrayDiff {

    public static void main(String[] args) {
        for (int i : arrayDiff(new int[]{1, 2, 2}, new int[]{})) {
            System.out.println(i);
        }
    }


    public static int[] arrayDiff(int[] a, int[] b) {

        if (b.length == 0) {
            return a;
        }

        int[] tempArrayDiff = new int[a.length];
        int indexForArrayDiff = 0;

        for (int j : a) {
            boolean foundInB = false;

            for (int k : b) {
                if (j == k) {
                    foundInB = true;
                    break;
                }
            }

            if (!foundInB) {
                tempArrayDiff[indexForArrayDiff] = j;
                indexForArrayDiff++;
            }
        }

        int[] arrayDiff = new int[indexForArrayDiff];
        System.arraycopy(tempArrayDiff, 0, arrayDiff, 0, indexForArrayDiff);

        return arrayDiff;
    }
}