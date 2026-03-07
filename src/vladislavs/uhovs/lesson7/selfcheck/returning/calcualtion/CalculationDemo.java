package vladislavs.uhovs.lesson7.selfcheck.returning.calcualtion;

import java.util.Scanner;
import java.util.Set;

public class CalculationDemo {
    private static int correctInput(Scanner input){
        while (!input.hasNextInt()){
            input.next();
            System.out.println("Wrong input. Input only numbers!");
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();

        int firstNumber;
        String operator;
        int secondNumber;
        Set<String> allowed = Set.of("+", "-", "*", "/", "%");

        System.out.println("Input first number");
        firstNumber = correctInput(input);
        System.out.println("Input operator: [+], [/], [-], [*], [%]");
        operator = input.next();
        while (!allowed.contains(operator)){
            System.out.println("Wrong operator input, input again");
            operator = input.next();
        }

        System.out.println("Input second number");
        secondNumber = correctInput(input);
        while (operator.equals("/") && secondNumber == 0){
            System.out.println("Can't divide by zero, input again");
            secondNumber = correctInput(input);
        }
        input.close();
        System.out.println(calculation.calculate(firstNumber, secondNumber, operator));
    }
}
