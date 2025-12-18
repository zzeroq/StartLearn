package vladislavs.uhovs.lesson6.homework.level5.task22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setUp(){
        this.ticTacToe = new TicTacToe();
    }
    private int[][] emptyField(){
        int[][] emptyField = new int[3][3];
        for (int[] ints : emptyField) {
            Arrays.fill(ints, -1);
        }
        return emptyField;
    }

    @Test
    @DisplayName("Should return true if fill out the row with the same numbers")
    public void horizontalWinConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        for (int c = 0; c < field.length; c++) {
            field[0][c] = playerOne;
        }
        assertTrue(ticTacToe.isWinPositionForHorizontals(field,playerOne));
    }

    @Test
    @DisplayName("Should return false if didn't fill out the row with the same numbers")
    public void horizontalFailConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        int playerTwo = 0;
        for (int c = 0; c < field.length; c++) {
            field[0][c] = playerOne;
        }
        field[0][1] = playerTwo;
        assertFalse(ticTacToe.isWinPositionForHorizontals(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if fill out the column with the same numbers")
    public void verticalsWinConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        for (int r = 0; r < field.length; r++) {
            field[r][0] = playerOne;
        }
        assertTrue(ticTacToe.isWinPositionForVerticals(field,playerOne));
    }

    @Test
    @DisplayName("Should return false if didn't fill out the column with the same numbers")
    public void verticalsFailConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        int playerTwo = 0;
        for (int r = 0; r < field.length; r++) {
            field[r][0] = playerOne;
        }
        field[1][0] = playerTwo;
        assertFalse(ticTacToe.isWinPositionForVerticals(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if fill out the diagonal with the same numbers")
    public void diagonalsWinConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        field[0][0] = playerOne;
        field[1][1] = playerOne;
        field[2][2] = playerOne;
        assertTrue(ticTacToe.isWinPositionForDiagonals(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if fill out the diagonal with the same numbers")
    public void diagonalsTwoWinConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        field[0][2] = playerOne;
        field[1][1] = playerOne;
        field[2][0] = playerOne;
        assertTrue(ticTacToe.isWinPositionForDiagonals(field,playerOne));
    }

    @Test
    @DisplayName("Should return False if didn't fill out the diagonal with the same numbers")
    public void diagonalsFalseConditionTest(){
        int[][] field = emptyField();
        int playerOne = 1;
        int playerTwo = 0;
        field[0][0] = playerOne;
        field[1][1] = playerTwo;
        field[2][2] = playerOne;
        assertFalse(ticTacToe.isWinPositionForDiagonals(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if horizontal win exist")
    public void isWinConditionTestHorizontal(){
        int[][] field = emptyField();
        int playerOne = 1;
        for (int c = 0; c < field[0].length; c++) {
            field[0][c] = playerOne;
        }
        assertTrue(ticTacToe.isWinPosition(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if vertical win exist")
    public void isWinConditionTestVertical(){
        int[][] field = emptyField();
        int playerOne = 1;
        for (int r = 0; r < field.length; r++) {
            field[r][0] = playerOne;
        }
        assertTrue(ticTacToe.isWinPosition(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if diagonal win exist")
    public void isWinConditionTestDiagonal(){
        int[][] field = emptyField();
        int playerOne = 1;
        field[0][2] = playerOne;
        field[1][1] = playerOne;
        field[2][0] = playerOne;
        assertTrue(ticTacToe.isWinPosition(field,playerOne));
    }

    @Test
    @DisplayName("Should return false if no win exist")
    public void isWinConditionTestFalse(){
        int[][] field = emptyField();
        int playerOne = 1;
        int playerTwo = 0;
        field[0][2] = playerOne;
        field[1][1] = playerTwo;
        field[2][0] = playerOne;
        assertFalse(ticTacToe.isWinPosition(field,playerOne));
    }

    @Test
    @DisplayName("Should return true if draw exist")
    public void isDrawConditionTest() {
        int[][] field = emptyField();
        int playerOne = 1;
        int playerTwo = 0;
        for (int[] ints : field) {
            Arrays.fill(ints, playerOne);
        }
        field[0][2] = playerTwo;
        field[0][0] = playerTwo;
        field[1][2] = playerTwo;
        field[2][1] = playerTwo;

        assertTrue(ticTacToe.isDrawPosition(field));
    }

    @Test
    @DisplayName("Should return False if draw don't exist")
    public void isDrawConditionTestFalse() {
        int[][] field = emptyField();
        int playerOne = 1;
        for (int r = 0; r < field.length; r++) {
            field[r][0] = playerOne;
        }
        assertFalse(ticTacToe.isDrawPosition(field));
    }

    @Test
    @DisplayName("Should return False if at least one array is empty")
    public void isDrawTwoConditionTestFalse() {
        int[][] field = emptyField();
        assertFalse(ticTacToe.isDrawPosition(field));
    }




}
