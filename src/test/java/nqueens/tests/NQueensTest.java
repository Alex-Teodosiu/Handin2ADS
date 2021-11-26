package nqueens.tests;

import nqueens.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static nqueens.Board.safeCheck;

public class NQueensTest {
    Board board;

    @Test
    void printBoard(){
        int[] x = new int[4];
        board.printBoard(x);
    }

    @Test
    void place4Queens(){
        int [] board = new int[4];
        Board.placeQueens(board, 4, 0);
        Assertions.assertEquals(4, Board.placeQueens(board, 4, 0));
    }

    @Test
    void place5Queens(){
        int [] board = new int[5];
        Board.placeQueens(board, 5, 0);
        Assertions.assertEquals(5, Board.placeQueens(board, 5, 0));
    }

    @Test
    void place6Queens(){
        int [] board = new int[6];
        Board.placeQueens(board, 6, 0);
        Assertions.assertEquals(6, Board.placeQueens(board, 6, 0));
    }

    @Test
    void place7Queens(){
        int [] board = new int[7];
        Board.placeQueens(board, 7, 0);
        Assertions.assertEquals(7, Board.placeQueens(board, 7, 0));
    }

    @Test
    void safetyCheck(){
        int [] board = new int[4];
        Assertions.assertEquals(false, safeCheck(board, 3));
    }
}