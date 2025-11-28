package vladislavs.uhovs.lesson5.homework.level2.task14;

import java.util.Random;

public class ArrayTask5 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
               total += numbers[i];
        }
            System.out.println(total/3);
    }

}
