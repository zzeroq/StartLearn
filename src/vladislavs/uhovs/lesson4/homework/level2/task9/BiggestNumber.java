package vladislavs.uhovs.lesson4.homework.level2.task9;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter whole first number (1/3)");
        int number1 = input.nextInt();
        System.out.println("Enter whole second number (2/3)");
        int number2 = input.nextInt();
        System.out.println("Enter whole third number (3/3)");
        int number3 = input.nextInt();
        input.close();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Biggest: " + number1);
        } else if (number2 >= number3) {
            System.out.println("Biggest: " + number2);
        } else {
            System.out.println("Biggest: " + number3);
        }
    }
}


