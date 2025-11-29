package vladislavs.uhovs.lesson5.homework.level4.task30;

import java.util.Random;

public class ArrayTask6 {
    public static void main(String[] args) {

        int[] numbers = new int[8];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        boolean isFirstOdd = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (isFirstOdd) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i]);
                isFirstOdd = true;
            }
        }
    }
}
