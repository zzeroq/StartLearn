package vladislavs.uhovs.lesson6.homework.level4.task21;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] arr2D = twoDimensionalArray.getArray2D(5, 6);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(arr2D[3]));
        System.out.println(Arrays.toString(arr2D[4]));

        int sumArr2D = twoDimensionalArray.getSum(arr2D);
        System.out.println();
        System.out.println("Sum of all numbers in 2D arrays is: " + sumArr2D);
    }
}