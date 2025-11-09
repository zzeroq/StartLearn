package vladislavs_uhovs.lesson2.newCoursesHomework.level_1.task_1;

import java.util.Scanner;

public class ScannerCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Int 1 = ");
        int number1 = input.nextInt();
        System.out.println("Int 2 = ");
        int number2 = input.nextInt();

        System.out.println("Sum = " + (number1 + number2));
        System.out.println("Subtract = " + (number1 - number2));
        System.out.println("Divide = " +  ((double)number1 / (double)number2));
        System.out.println("Multiply = " + (number1 * number2));




    }
}
