package org.example.codewar.training;

/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */
public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("latin is cool[]"));
    }

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (Character.isLetter(word.charAt(0))) {
                String pigWord = word.substring(1) + word.charAt(0) + "ay";
                result.append(pigWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
