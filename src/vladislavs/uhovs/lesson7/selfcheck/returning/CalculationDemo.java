package vladislavs.uhovs.lesson7.selfcheck.returning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();

        int firstNumber;
        String operator;
        int secondNumber;

        System.out.println("Input first number");
        while (!input.hasNextInt()){
            input.next();
            System.out.println("Wrong input. Input only numbers!");
        }
        firstNumber = input.nextInt();
        System.out.println("Input operator +,/,-,*");
        operator = input.next();
        while (!operator.equals("+") && !operator.equals("/") && !operator.equals("-") && !operator.equals("*")){
            System.out.println("Wrong operator input, input again");
            operator = input.next();
        }

        System.out.println("Input second number");
        while (!input.hasNextInt()){
            input.next();
            System.out.println("Wrong input. Input only numbers!");
        }
        secondNumber = input.nextInt();
        while (operator.equals("/") && secondNumber == 0){
            System.out.println("Can't divide by zero, input again");
            secondNumber = input.nextInt();
        }
        input.close();
        switch (operator) {
            case "+" -> System.out.println(calculation.sum(firstNumber, secondNumber));
            case "/" -> System.out.println(calculation.div(firstNumber, secondNumber));
            case "-" -> System.out.println(calculation.sub(firstNumber, secondNumber));
            case "*" -> System.out.println(calculation.mul(firstNumber, secondNumber));
        }
    }
}
