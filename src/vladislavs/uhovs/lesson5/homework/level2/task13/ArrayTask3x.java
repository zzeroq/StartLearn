package vladislavs.uhovs.lesson5.homework.level2.task13;

import java.util.Random;

public class ArrayTask3x {
    public static void main(String[] args) {

        int[] sum = new int[3];
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < sum.length; i++) {
           sum[i] = random.nextInt(10);
           total += sum[i];
        }
        System.out.println(total);

    }
}
