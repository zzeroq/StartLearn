package vladislavs.uhovs.lesson5.homework.level2.task12;

import java.util.Random;

public class ArrayTask4 {

    public static void main(String[] args) {

        int[] sum = new int[3];
        Random random = new Random();

        int count = 0;
        for (int i = 0; i < sum.length; i++) {
            sum[i] = random.nextInt(10);
            if (count > 0) {
                System.out.print(" ");
            }
            System.out.print(sum[i]);
            count++;
        }
    }
}