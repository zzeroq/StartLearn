package vladislavs.lesson2.lesson;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1 = ");
        int number1 = scanner.nextInt();
        System.out.println("Nubber 1 = " + number1);

        System.out.println("Enter number 2 = ");
        int number2 = scanner.nextInt();
        System.out.println("Nubber 2 = " + number2);

        System.out.println("Enter number 3 = ");
        int number3 = scanner.nextInt();
        System.out.println("Number 3 = " + number3);

        int sum = number1 + number2 + number3;
        System.out.println("Sum = " + sum);



    }


}
