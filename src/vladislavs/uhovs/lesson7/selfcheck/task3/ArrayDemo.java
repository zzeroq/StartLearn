package vladislavs.uhovs.lesson7.selfcheck.task3;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        Array array = new Array(new Random());

        System.out.println(Arrays.deepToString(array.array2D(4,6)));
        System.out.println(Arrays.deepToString(array.array2D(4,4)));
        System.out.println(Arrays.deepToString(array.array2D(6,3)));
        System.out.println();

        System.out.println(Arrays.deepToString(array.arraysSecond(4,6)));
        System.out.println(Arrays.deepToString(array.arraysSecond(4,4)));
        System.out.println(Arrays.deepToString(array.arraysSecond(6,4)));

    }
}
