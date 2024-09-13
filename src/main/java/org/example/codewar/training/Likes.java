package org.example.codewar.training;

/*
   You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
pictures or other items. We want to create the text that should be displayed next to such an item.

   Implement the function which takes an array containing the names of people that like an item.

   It must return the display text as shown in the examples:
 */
public class Likes {

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jacob", "Alex"));
    }

    public static String whoLikesIt(String... names) {
        StringBuilder stringBuffer = new StringBuilder();
        int numbersWhoLike = names.length;
        if (numbersWhoLike == 0) {
            stringBuffer.append("no one likes this");
        }
        if (numbersWhoLike == 1) {
            stringBuffer.append(names[0]);
            stringBuffer.append(" ");
            stringBuffer.append("likes this");
        }
        if (numbersWhoLike == 2) {
            stringBuffer.append(names[0]);
            stringBuffer.append(" and ");
            stringBuffer.append(names[1]);
            stringBuffer.append(" like this");
        }
        if (numbersWhoLike == 3) {
            stringBuffer.append(getForThree(names));
            stringBuffer.append(names[2]);
            stringBuffer.append(" like this");
        }
        if (numbersWhoLike > 3) {
            stringBuffer.append(getForThree(names));
            stringBuffer.append(numbersWhoLike - 2);
            stringBuffer.append(" others like this");
        }
        return stringBuffer.toString();
    }

    public static String getForThree(String... names) {
        return names[0] + ", " + names[1] + " and ";
    }
}
