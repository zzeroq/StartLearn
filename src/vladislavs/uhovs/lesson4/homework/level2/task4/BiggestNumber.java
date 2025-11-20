package vladislavs.uhovs.lesson4.homework.level2.task4;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number (1/2)");
        int number1 = input.nextInt();
        System.out.println("Enter second number (2/2)");
        int number2 = input.nextInt();
        input.close();

        if        (number1 > number2){
            System.out.println("Biggest: " + number1);
        } else if (number1 < number2){
            System.out.println("Biggest: " + number2);
        } else {
            System.out.println(number1 + " = " + number2);
        }
    }
}
