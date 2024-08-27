package org.example.binarysearch;

/*
Find integer from an array using binary search
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {76, 34, 90, 12, 6, 54, 56, 12, 1, 8};
        getSortedArray(array);
        System.out.println(foundNumber(array, 2));
    }

    public static boolean foundNumber(int[] numbers, int numberToSearch) {
        getSortedArray(numbers);
        boolean isFound = false;
        int middle = numbers.length / 2;
        int steps = 0;
        int maxSteps = (int) (Math.log(numbers.length) / Math.log(2));

        while (!isFound && steps <= maxSteps) {
            steps++;
            if (numberToSearch == numbers[middle]) {
                isFound = true;
            } else if (numberToSearch > numbers[middle]) {
                middle += (numbers.length - middle) / 2;
            } else {
                middle -= middle / 2;
            }
        }

        return isFound;
    }

    public static void getSortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
