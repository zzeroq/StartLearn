package vladislavs.uhovs.lesson7.selfcheck.task1;

public class Calculation {

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

}
