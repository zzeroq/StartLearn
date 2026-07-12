package vladislavs.uhovs.lesson7.selfcheck;

public class CalcLog {

    public int sum (int num1, int num2){
        return num1 + num2;
    }
    public int div (int num1, int num2){
        return num1 / num2;
    }
    public int sub (int num1, int num2){
        return num1 - num2;
    }
    public int multi (int num1, int num2){
        return num1 * num2;
    }

    public int calculate(int numberOne, int numberTwo, String operator) {
        return switch (operator) {
            case "+" -> sum(numberOne, numberTwo);
            case "-" -> sub(numberOne, numberTwo);
            case "/" -> div(numberOne, numberTwo);
            case "*" -> multi(numberOne, numberTwo);
            default -> throw new IllegalArgumentException("Invalid input operator");
        };
    }

}
