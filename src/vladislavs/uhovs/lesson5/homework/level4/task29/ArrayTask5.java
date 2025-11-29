package vladislavs.uhovs.lesson5.homework.level4.task29;

import java.util.Random;

public class ArrayTask5 {
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

        boolean isFirstEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (isFirstEven) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i]);
                isFirstEven = true;

            }
        }
    }
}
