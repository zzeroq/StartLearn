package vladislavs.uhovs.lesson4.homework.level2.task6;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number (1/2)");
        int number1 = input.nextInt();
        System.out.println("Enter second number (2/2)");
        int number2 = input.nextInt();
        input.close();

        /*if (number1 == number2) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }
         */
        System.out.println((number1 == number2 ? "Numbers are equal" : "Numbers are different"));

    }
}
