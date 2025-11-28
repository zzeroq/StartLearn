package vladislavs.uhovs.lesson5.homework.level2.task15;

import java.util.Random;

public class ArrayTask6 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();


        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            if (count > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
            count++;

        }
        System.out.println();
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (count > 0) {
                System.out.print(" ");
            }
            numbers[i] = numbers[i] + 2;
            System.out.print(numbers[i]);
            count++;
        }
    }
}