package vladislavs.uhovs.lesson5.lesson.loop.fori;

import java.util.Arrays;
import java.util.Random;

public class DemoArraysLoops {
    public static void main(String[] args) {

        Random random = new Random();

        int[] value = new int[100];
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));

       // int[] value = new int [100];
        for (int i = 0; i < value.length; i++) {
            value[i] = random.nextInt(1000);
        }
       // System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }

        int sum = 0;
        int min = value[0];
        int max = value[0];
        for (int i = 0; i < value.length; i++) {
            sum += value[i];

            if (min > value[i]){
                min = value[i];
            }
            if (max < value[i]){
                max = value[i];
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (sum / (double)value.length));
        System.out.println("min = " + min);
        System.out.println("mag = " + max);

    }

}
