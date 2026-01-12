package vladislavs.uhovs.lesson7.selfcheck.task1;

public class CalculationDemo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        System.out.println("5 + 6 = " + calculation.sum(5,6));
        System.out.println("6 + 5 = " + calculation.subtract(6,5));
        System.out.println("5 * 6 = " + calculation.multiply(5,6));
        System.out.println("30 / 6 = " + calculation.divide(30,6));

    }
}
