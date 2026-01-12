package vladislavs.uhovs.lesson7.selfcheck.task2;

public class Calculator {

    public int sum(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    public int subtract(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    public int multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public int divide(int numberOne, int numberTwo){
        if (numberTwo == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return numberOne / numberTwo;
    }

    public int calculate(int numberOne, int numberTwo, String operator){
        return switch (operator) {
            case "+" -> sum(numberOne, numberTwo);
            case "-" -> subtract(numberOne, numberTwo);
            case "*" -> multiply(numberOne, numberTwo);
            case "/" -> divide(numberOne, numberTwo);
            default -> throw new IllegalArgumentException("Invalid input operator");
        };
    }
}
