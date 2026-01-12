package vladislavs.uhovs.lesson7.selfcheck.task2;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exception = true;

        while (exception) {
        System.out.println("Input first number to calculate");
        int firstNumber = input.nextInt();
        System.out.println("Input operator +,-,*,/ or %");
        String operator = input.next();
        System.out.println("Input second number to calculate");
        int secondNumber = input.nextInt();
        Calculator calculator = new Calculator();
            try {
                System.out.println(calculator.calculate(firstNumber, secondNumber, operator));
                exception = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }
}
