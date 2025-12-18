package vladislavs.uhovs.lesson6.homework.level4.task21;

import java.util.Random;

public class TwoDimensionalArray {
    private final Random random;

    public TwoDimensionalArray(){
        this.random = new Random();
    }
    public int[][] getArray2D(int row, int column) {
        int[][] arr2D = new int[row][column];
        for (int r = 0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[r].length; c++) {
                arr2D[r][c] = random.nextInt(10);
            }
        }
        return arr2D;
    }

    public int getSum(int[][] arr2D){
        int sum = 0;
        for (int r = 0; r < arr2D.length ; r++) {
            for (int c = 0; c < arr2D[r].length; c++) {
                sum += arr2D[r][c];
            }
        }
        return sum;
    }


}
