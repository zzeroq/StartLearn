package vladislavs.uhovs.lesson5.homework.level2.task11;

import java.util.Scanner;

public class ArrayTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number: (1/3)");
        int number1 = input.nextInt();

        System.out.println("Input number: (2/3)");
        int number2 = input.nextInt();

        System.out.println("Input number: (3/3)");
        int number3 = input.nextInt();
        input.close();

        int[] numbers = {number1, number2, number3};
        int count = 0;
        for (int symbols : numbers) {
            if (count > 0) {
                System.out.print(" ");
            }
            System.out.print(symbols);
            count++;
        }
    }
}