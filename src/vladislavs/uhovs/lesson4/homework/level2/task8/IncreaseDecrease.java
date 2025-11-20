package vladislavs.uhovs.lesson4.homework.level2.task8;

import java.util.Scanner;

public class IncreaseDecrease {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number (1/3)");
        int number1 = input.nextInt();
        System.out.println("Enter second number (2/3)");
        int number2 = input.nextInt();
        System.out.println("Enter third number (3/3)");
        int number3 = input.nextInt();
        input.close();

        if (number1 < number2 && number2 < number3) {
            System.out.println("increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}

