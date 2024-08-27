package org.example.sort;

import java.util.Arrays;
import java.util.List;

public class HorseRace {
    /*
    We have more horses, and we now the weight
    From this array of horses we want to choose two horses with the most almost weight and to calculate the difference.

    In my opinion to have elements to be more almost we have at the start to sort them, and after we can make difference between almost sorted elements.

    1 5 2 9 3
    1 2 3 5 9
     */
    public static void main(String[] args) {
        List<Integer> horsesWeight = Arrays.asList(4, 35, 7, 100, 1, 10);
        System.out.println(getDifferenceBetweenTheMostAlmostHeightOfHorses(horsesWeight));
    }

    public static int getDifferenceBetweenTheMostAlmostHeightOfHorses(List<Integer> horsesWeight) {
        int smallestDifference = Integer.MAX_VALUE;
        sortListWithHorsesHeights(horsesWeight);
        for (int i = 0; i < horsesWeight.size() - 1; i++) {
            int difference = horsesWeight.get(i + 1) - horsesWeight.get(i);
            if (difference < smallestDifference) {
                smallestDifference = difference;
            }
        }
        return smallestDifference;
    }

    private static void sortListWithHorsesHeights(List<Integer> horsesWeight) {
        for (int i = 0; i < horsesWeight.size(); i++) {
            for (int j = 0; j < horsesWeight.size() - i - 1; j++) {
                if (horsesWeight.get(j) > horsesWeight.get(j + 1)) {
                    int temp = horsesWeight.get(j + 1);
                    horsesWeight.set(j + 1, horsesWeight.get(j));
                    horsesWeight.set(j, temp);
                }
            }
        }
    }
}
