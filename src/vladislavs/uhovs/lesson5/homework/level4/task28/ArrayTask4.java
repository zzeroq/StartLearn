package vladislavs.uhovs.lesson5.homework.level4.task28;

import java.util.Random;

public class ArrayTask4 {
    public static void main(String[] args) {

        int[] numbers = new int[8];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0){
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }

        int min = numbers[0];
        for (int n : numbers) {
            if (n < min){
                min = n;
            }
        }
        System.out.println();
        System.out.println(min);
    }
}
