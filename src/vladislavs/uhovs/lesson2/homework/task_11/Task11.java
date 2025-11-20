package vladislavs.uhovs.lesson2.homework.task_11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tell me a random number 1/3:");
        double number1 = input.nextDouble();
        System.out.println("Tell me a random number 2/3:");
        double number2 = input.nextDouble();
        System.out.println("Tell me a random number 3/3:");
        double number3 = input.nextDouble();
        System.out.printf("Average = %.2f%n", (number1+number2+number3)/3);


    }



}
