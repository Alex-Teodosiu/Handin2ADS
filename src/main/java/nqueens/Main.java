package nqueens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the value of n:");
        int n = scanner.nextInt();
        int [] board = new int[n];
        Board.placeQueens(board, n, 0);
    }
}
