package org.example.codewar.training;

public class ShortestWord {
    public static void main(String[] args) {
        int result = findWord("I'm your biggest fan and i");
        System.out.println(result);

    }

    public static int findWord(String string) {
        String[] str = string.split(" ");
        int min = str[0].length();
        for (int i = 0; i < str.length - 1; i++) {
            if (min > str[i + 1].length()) {
                min = str[i + 1].length();
            }
        }
        return min;
    }
}

