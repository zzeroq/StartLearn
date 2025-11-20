package vladislavs.uhovs.lesson4.homework.level1.task3;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int number = input.nextInt();
        input.close();

        /*
        if (number % 2 == 0){
            System.out.println("Even number!");
        }else {
            System.out.println("Odd number!");
        }
         */
        System.out.println((number % 2 == 0) ? "Even" : "Odd");
    }
}
