package vladislavs.uhovs.lesson4.homework.level2.task5;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number (1/2)");
        int number1 = input.nextInt();
        System.out.println("Enter second number (2/2)");
        int number2 = input.nextInt();
        input.close();

        if        (number1 < number2){
            System.out.println("Smallest: " + number1);
        } else if (number1 > number2){
            System.out.println("Smallest: " + number2);
        } else {
            System.out.println(number1 + " = " + number2);
            //System.out.println("Smallest number: " + number1 + " (Both are equal)");
        }
    }
}
