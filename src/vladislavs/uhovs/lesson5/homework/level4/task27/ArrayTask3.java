package vladislavs.uhovs.lesson5.homework.level4.task27;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {

        int[] numbers = new int[7];
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
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
