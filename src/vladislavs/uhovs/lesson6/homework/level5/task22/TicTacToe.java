package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Scanner;

public class TicTacToe {


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

}
