package vladislavs.uhovs.lesson7.selfcheck.task3;

import java.util.Random;

public class Array {
    Random random;

    public Array(Random random) {
        this.random = random;
    }

    public int[][] array2D(int row, int col){
        int[][] array2D = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                array2D[r][c] = random.nextInt(10);
            }
        }
        return array2D;
    }

    public int[][] arraysSecond(int row, int col){
        int[][] arrays2D = new int[row][col];
        for (int r = 0; r < arrays2D.length; r++) {
            for (int c = 0; c < arrays2D[r].length; c++) {
               arrays2D[r][c] = random.nextInt(10);
            }
        }
        return arrays2D;
    }

}
