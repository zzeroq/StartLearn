package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private final Scanner input;
    private final Random random;

    public TicTacToe(Scanner input, Random random){
        this.input = input;
        this.random = random;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        for (int r = 0; r < field.length; r++) {
            if (field[r][0] == playerToCheck && field[r][1] == playerToCheck && field[r][2] == playerToCheck){
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int c = 0; c < field.length; c++) {
            if (field[0][c] == playerToCheck && field[1][c] == playerToCheck && field[2][c] == playerToCheck){
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck){
            return true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field){
        if (isWinPosition(field,1) || (isWinPosition(field,0))){
            return false;
        }
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c] == -1) return false;
            }

        }
         return true;
    }

    public int[][] createField(){
        int[][] field = new int[3][3];
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                field[r][c] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        System.out.println("Choose Y position on the field - 0,1 or 2");
        int y = input.nextInt();
        System.out.println("Choose X position on the field - 0,1 or 2");
        int x = input.nextInt();
        Move move = new Move(y, x);
        return move;
    }

    private String cell(int a){
        if (a == -1) return "⏹️";
        if (a == 1) return "❌";
        return "⭕";
    }

    public void printFieldToConsole(int[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(cell(field[r][c]) + " ");
            }
            System.out.println();
        }
    }

    public Move getNextMoveForAI(int[][] field) {
        int ai = 1;
        int human = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (field[r][c] == -1) {
                    field[r][c] = ai;
                    boolean win = isWinPosition(field, ai);
                    field[r][c] = -1;
                    if (win) {
                        return new Move(r, c);
                    }
                }
            }
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (field[r][c] == -1) {
                    field[r][c] = human;
                    boolean humanWins = isWinPosition(field, human);
                    field[r][c] = -1;
                    if (humanWins) {
                        return new Move(r, c);
                    }
                }
            }
        }
        int y = random.nextInt(3);
        int x = random.nextInt(3);
        while (field[y][x] != -1){
            y = random.nextInt(3);
            x = random.nextInt(3);
        }
        return new Move(y, x);
    }

    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        while(true) {
            Move human = getNextMove();
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
            Move ai = getNextMoveForAI(field);
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
