package vladislavs.uhovs.lesson4.homework.level7.task19;

import java.util.Scanner;

public class CalculatorDapp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator!");
        System.out.println("Input first number");
        double firstNumber = input.nextDouble();

        System.out.println("Input operation (+, -, *, /): ");
        String operation = input.next();

        System.out.println("Input second number");
        double secondNumber = input.nextDouble();

        double result = 0;
        boolean validoperation = true;

        switch (operation) {
            case "+" -> result = calculator.sum(firstNumber, secondNumber);
            case "-" -> result = calculator.sub(firstNumber, secondNumber);
            case "*" -> result = calculator.mul(firstNumber, secondNumber);
            case "/" -> result = calculator.div(firstNumber, secondNumber);
            default -> validoperation = false;
        }
        input.close();

        if (validoperation){
            System.out.println(" = " + result);
        }else {
            System.out.println("Error");
        }


    }
}
