package vladislavs.uhovs.lesson5.homework.level4.task25;

import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of array: ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number by each - " + (i+1) + ":");
            numbers[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (count > 0){
            System.out.print(" ");

            }
            System.out.print(numbers[i]);
            count++;
        }
    }
}