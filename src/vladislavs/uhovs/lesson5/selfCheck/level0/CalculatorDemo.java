package vladislavs.uhovs.lesson5.selfCheck.level0;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Input first number: ");
        double number1 = input.nextDouble();
        System.out.println("Input one operator: + , - , * , /, % ");
        String operator = input.next();
        System.out.println("Input second number: ");
        double number2 = input.nextDouble();

        switch (operator) {
            case "+" -> System.out.println(number1 + " + " + number2 + " = " + calculator.sum(number1, number2));
            case "-" -> System.out.println(number1 + " - " + number2 + " = " + calculator.sub(number1, number2));
            case "*" -> System.out.println(number1 + " * " + number2 + " = " + calculator.mul(number1, number2));
            case "/" -> {
                if (number2 == 0) {
                    System.out.println("Error: CAN'T DIVIDE BY ZERO!");
                }else {
                    System.out.println(number1 + " / " + number2 + " = " + calculator.div(number1, number2));
                }
            }
            case "%" -> System.out.println(number1 + " % " + number2 + " = " + calculator.percent(number1, number2));
            default -> System.out.println("Wrong Input!");
        }
        input.close();
    }
}
