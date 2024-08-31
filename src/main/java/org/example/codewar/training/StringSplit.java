package org.example.codewar.training;


/*
   Complete the solution so that it splits the string into pairs of two characters.

   If the string contains an odd number of characters then it should replace
the missing second character of the final pair with an underscore ('_').

   Examples:

  'abc' =>  ['ab', 'c_']
  'abcdef' => ['ab', 'cd', 'ef']

 */
public class StringSplit {

    public static void main(String[] args) {
        solution("asd3");
    }

    public static String[] solution(String s) {
        int length = (s.length() + 1) / 2;
        int indexOfPairs = 0;

        String[] pairs = new String[length];

        for (int i = 0; i < s.length(); i += 2) {
            if(i+1 <s.length()){
                pairs[indexOfPairs] = s.substring(i,i+2);
            } else {
                pairs[indexOfPairs] = s.charAt(i) + "_";
            }
        }
        return pairs;
    }
}

