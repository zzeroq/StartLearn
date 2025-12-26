package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private final Scanner input;
    private final Random random;
    private static final int EMPTY = -1;
    private static final int HUMAN = 0;
    private static final int AI = 1;

    public TicTacToe(Scanner input, Random random) {
        this.input = input;
        this.random = random;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            if (ints[0] == playerToCheck && ints[1] == playerToCheck && ints[2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int c = 0; c < field.length; c++) {
            if (field[0][c] == playerToCheck && field[1][c] == playerToCheck && field[2][c] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else return field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        if (isWinPosition(field, 1) || (isWinPosition(field, 0))) {
            return false;
        }
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == EMPTY) return false;
            }

        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, EMPTY);
        }
        return field;
    }

    public Move getNextMove(int[][] field) {
        while(true) {
           int y = readCoordinate("Y");
           int x = readCoordinate("X");

            if (field[y][x] == EMPTY) {
                return new Move(y, x);
            }
            System.out.println("This cell is already taken. Choose another one.");
        }
    }

    private int readCoordinate(String axis){
        while (true) {
            System.out.println("Choose " + axis + " position on the field - 0,1 or 2");
            while ((!input.hasNextInt())) {
                input.next();
                System.out.println("Input only numbers!");
            }
            int value = input.nextInt();
            if (value >= 0 && value < 3){
                return value;
            }
            System.out.println("Input numbers in range!");
        }
    }



    private String cell(int a) {
        if (a == -1) return "⏹️";
        if (a == 1) return "❌";
        return "⭕";
    }

    private void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.print(cell(anInt) + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        AiPlayer aiPlayer = new AiPlayer(random, this);
        int[][] field = createField();
        printFieldToConsole(field);
        while (true){
            playHuman(field);
            if (gameOver(field, "Human ", HUMAN)){
                break;
            }
            playAi(field, aiPlayer.chooseMove(field));
            if (gameOver(field, "AI ", AI)){
                break;
            }
        }
    }

    public boolean gameOver(int[][] field, String player, int turn){
        if (isWinPosition(field, turn)) {
            System.out.println(player + "WINS!");
            return true;
        }
        if (isDrawPosition(field)) {
            System.out.println("DRAW!");
            return true;
        }
        System.out.println();
        return false;
    }

    public void playHuman(int[][] field) {
        System.out.println("Your turn");
        Move human = getNextMove(field);
        field[human.getMoveY()][human.getMoveX()] = HUMAN;
        printFieldToConsole(field);
    }

    public void playAi(int[][] field, Move aiMove){
        System.out.println("AI turn");
        field[aiMove.getMoveY()][aiMove.getMoveX()] = AI;
        printFieldToConsole(field);
    }

}
