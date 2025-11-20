package vladislavs.uhovs.lesson4.homework.level1.task1;

import java.util.Scanner;

public class RequestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tell me any prime number: ");
        int number = input.nextInt();
        System.out.println(number);
        input.close();
    }
}
