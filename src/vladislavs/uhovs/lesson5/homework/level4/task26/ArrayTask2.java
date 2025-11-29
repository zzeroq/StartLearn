package vladislavs.uhovs.lesson5.homework.level4.task26;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Input numbers length: ");
        int length = input.nextInt();
        int[] numbers = new int[length];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0){
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
    }
}
