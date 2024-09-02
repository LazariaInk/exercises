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
        for(String s : solution("mamaa")){
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String s) {
        int length = s.length();
        int arrayLength = (length + 1) / 2;
        String[] arrayOFStrings = new String[arrayLength];
        int indexOfArrayOfStrings = 0;
        if (length % 2 != 0) {
            s = s + "_";
        }
        for (int i = 0; i < s.length(); i += 2) {
            arrayOFStrings[indexOfArrayOfStrings] = s.substring(i, i + 2);
            indexOfArrayOfStrings++;
        }
        return arrayOFStrings;
    }
}

