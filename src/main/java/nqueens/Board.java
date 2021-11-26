package nqueens;

import java.util.Scanner;

public class Board {


    public static int placeQueens(int[] board, int numberOfQueens, int selected)
    {
        if(board.length < 3 ){
            System.out.println("Choose a number bigger than 3!");
            return -1;
        }
        int count = 0;
        if (selected == numberOfQueens)
        {
            printBoard(board);
            return count;
        }

        for (int i = 0; i < numberOfQueens; i++)
        {
            board[selected] = i;
            if (safeCheck(board, selected))
            {
                placeQueens(board, numberOfQueens, selected + 1);
                count++;
            }
        }
        return count;
    }

    public static void printBoard(int[] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int value : board) {
                if (value == i)
                    System.out.print("Q ");
                else
                    System.out.print("- ");
            }
            System.out.print("\n");
        }
        System.out.println("-------------------------------------------------------------");
    }

    public static boolean safeCheck(int[] board, int selected)
    {
        for (int i = 0; i < selected; i++) {
            if (board[i] == board[selected])
                return false;
            if ((selected - i) == Math.abs(board[selected] - board[i])) {
                return false;
            }
        }
        return true;
    }
}

