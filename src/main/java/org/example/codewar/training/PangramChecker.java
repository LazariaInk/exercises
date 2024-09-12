package org.example.codewar.training;

import java.util.HashSet;
import java.util.Set;

/*
   A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because
it uses the letters A-Z at least once (case is irrelevant).

   Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(check("abcdefghijkopqrstuvwxyz"));
    }

    public static boolean check(String sentence){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase();
        Set<Character> characterSet = new HashSet<>();
        for(char letterFromSentence : sentence.toCharArray()) {
            if(alphabet.contains(String.valueOf(letterFromSentence))) {
                characterSet.add(letterFromSentence);
            }
        }
        return characterSet.size() == 26;
    }
}
