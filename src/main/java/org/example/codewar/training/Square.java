package org.example.codewar.training;

/*
A square of squares

You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether
 you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
 */
public class Square {

    public static void main(String[] args) {

    }

    public static boolean isSquare(int n) {
        if(n < 0) {
            return false;
        }
        if(n == 0) {
            return true;
        }
        for(int i = 0; i < n; i ++) {
            if(i * i ==n) {
                return true;
            }
            if(i*i > n) {
                return false;
            }
        }
        return false;
    }
}
