package vladislavs.uhovs.lesson5.homework.level2.task12;

import java.util.Random;

public class ArrayTask4 {

    public static void main(String[] args) {

        int[] sum = new int[3];
        Random random = new Random();
        sum[0] = random.nextInt(100);
        sum[1] = random.nextInt(100);
        sum[2] = random.nextInt(100);

        int count = 0;
        for (int symbol : sum) {
            if (count > 0) {
                System.out.print(" ");
            }
            System.out.print(symbol);
            count++;
        }
    }
}