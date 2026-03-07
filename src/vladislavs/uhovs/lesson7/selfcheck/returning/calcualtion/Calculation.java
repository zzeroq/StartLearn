package vladislavs.uhovs.lesson7.selfcheck.returning.calcualtion;

public class Calculation {

    public int sum(int a, int b){
        return a + b;
    }
    public double div(int a, int b){
        return (double) a / b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public double percent(int percent, int number){
        return (double) (percent * number) / 100;
    }

    public double calculate(int firstNumber, int secondNumber, String operation){
        return switch (operation) {
            case "+" -> sum(firstNumber, secondNumber);
            case "/" -> {
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                yield div(firstNumber, secondNumber);
            }
            case "-" -> sub(firstNumber, secondNumber);
            case "*" -> mul(firstNumber, secondNumber);
            case "%" -> percent(firstNumber, secondNumber);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
