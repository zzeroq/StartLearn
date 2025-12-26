package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private final Scanner input;
    private final Random random;

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
                if (anInt == -1) return false;
            }

        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }
        return field;
    }

    public Move getNextMove(int[][] field) {
        while (true) {
            System.out.println("Choose Y position on the field - 0,1 or 2");
            int y = input.nextInt();
            while (y < 0 || y > 2) {
                y = input.nextInt();
            }
            System.out.println("Choose X position on the field - 0,1 or 2");
            int x = input.nextInt();
            while (x < 0 || x > 2) {
                x = input.nextInt();
            }
            if (field[y][x] == -1) {
                return new Move(y, x);
            }
            System.out.println("This cell is already taken. Choose another one.");
        }
    }

    private String cell(int a) {
        if (a == -1) return "⏹️";
        if (a == 1) return "❌";
        return "⭕";
    }

    public void printFieldToConsole(int[][] field) {
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
        while (true) {
            Move human = getNextMove(field);
            field[human.getMoveY()][human.getMoveX()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Human WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println();
            System.out.println("AI turn");
            Move ai = aiPlayer.chooseMove(field);
            field[ai.getMoveY()][ai.getMoveX()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("AI WINS!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
