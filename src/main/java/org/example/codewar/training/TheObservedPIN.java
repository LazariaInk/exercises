package org.example.codewar.training;


/*
He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent
digit (horizontally or vertically, but not diagonally). E.g. instead of the 1 it could also be the 2 or 4.
 And instead of the 5 it could also be the 2, 4, 6 or 8.

He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs,
they never finally lock the system or sound the alarm. That's why we can try out all possible (*) variations.

* possible in sense of: the observed PIN itself and all variations considering the adjacent digits

Can you help us to find all those variations? It would be nice to have a function,
that returns an array (or a list in Java/Kotlin and C#) of all variations for an observed PIN with a length of 1 to 8 digits.
We could name the function getPINs (get_pins in python, GetPINs in C#). But please note that all PINs,
the observed one and also the results, must be strings, because of potentially leading '0's.
We already prepared some test cases for you.

Detective, we are counting on you!
┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘

 */

import java.util.*;

public class TheObservedPIN {
    public static void main(String[] args) {
        List<List<Integer>> res =  getPINs("21");
        res.forEach(e->{
            System.out.println();
           e.forEach(elem->{
               System.out.print(elem+ " ");
           });
        });



    }

    //123
    public static  List<List<Integer>> getPINs(String observed) {
        List<String> PINs = new ArrayList<>();
        List<Integer> firstLine = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> secondLine = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> theirdLine = new ArrayList<>(Arrays.asList(7, 8, 9));

        Set<Integer> possibleUsedDigits = new HashSet<>();

        List<List<Integer>> passwordFromPossibleCombinations = new ArrayList<>();
        for(int i = 0; i < observed.length(); i ++) {
            passwordFromPossibleCombinations.add(new ArrayList<>());
        }

        for(Character charDigit : observed.toCharArray()) {
            int intDigit = Integer.parseInt(String.valueOf(charDigit));

            if(firstLine.contains(intDigit)) {
                if(intDigit == 1) {
                    possibleUsedDigits.add(firstLine.get(0));
                    possibleUsedDigits.add(firstLine.get(1));

                } else if(intDigit==firstLine.size()) {
                    possibleUsedDigits.add(firstLine.size());
                    possibleUsedDigits.add(firstLine.size()-1);
                } else {
                    possibleUsedDigits.addAll(firstLine);
                }
            }
            ;
            passwordFromPossibleCombinations.add(possibleUsedDigits.stream().toList());
            possibleUsedDigits.clear();
        }


        return passwordFromPossibleCombinations;

    }
}
