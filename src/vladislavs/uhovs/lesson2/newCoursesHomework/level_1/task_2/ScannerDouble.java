package vladislavs.uhovs.lesson2.newCoursesHomework.level_1.task_2;

import java.util.Scanner;

public class ScannerDouble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Double 1 = ");
        double number1 = input.nextDouble();
        System.out.println("Double 2 = ");
        double number2 = input.nextDouble();

        System.out.println("Sum = " + (number1 + number2));
        System.out.println("Subtract = " + (number1 - number2));
        System.out.println("Divide = " + (number1 / number2));
        System.out.println("Multiply = " + (number1 * number2));


    }


}
