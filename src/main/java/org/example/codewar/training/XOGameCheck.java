package org.example.codewar.training;

/*
If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we?
Our goal is to create a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
We want our function to return:

-1 if the board is not yet finished AND no one has won yet (there are empty spots),
1 if "X" won,
2 if "O" won,
0 if it's a cat's game (i.e. a draw).
You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
 */
public class XOGameCheck {

    public static void main(String[] args) {
        int[][] hz = new int[][]{{1,1,1},{1,1,1},{1,1,1}};

        System.out.println(checkFirstDiagonal(hz));
    }

    public static int isSolved(int[][] board) {

        return 0;
    }

    public static int checkFirstDiagonal(int[][] board){
        boolean isEquals = false;
        for(int i = 0; i < board.length-1; i ++) {
           if(board[i][i] ==board[i+1][i+1]) {
               isEquals = true;
           } else {
               isEquals = false;
               break;
           }
        }
        if(isEquals){
            return board[0][0];
        } else {
            return  -1;
        }
    }
}
