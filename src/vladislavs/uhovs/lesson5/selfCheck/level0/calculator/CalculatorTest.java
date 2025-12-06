package vladislavs.uhovs.lesson5.selfCheck.level0.calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.percentTest();
        calculatorTest.doubleProblemTest();

    }

    private void checkResult(String testName, double expected, double actual){
        double epsilon = 0.00000001;
        if (Math.abs(expected - actual) < epsilon){
            System.out.println(testName + " test: OK!");
        }else{
            System.out.println(testName + " test: FAIL!" + " Expected: " + expected + " Getting: " + actual);
        }
    }

    private final Calculator calculator = new Calculator();

    public void doubleProblemTest() {
        double a = 0.1;
        double b = 0.2;
        double result = a + b;
        double expected = 0.3;

        checkResult("Double problem", expected, result);
    }


    public void sumTest(){
        double result = calculator.sum(-5,5);
        checkResult("Sum", 0 , result);
    }

    public void subTest(){
        double result = calculator.sub(15,25);
        checkResult("Subtract", -10 , result);
    }

    public void mulTest(){
        double result = calculator.mul(-15.234,-5.542);
        checkResult("Multiply", 84.426828 , result);
    }

    public void divTest(){
        double result = calculator.div(15.5,5);
        checkResult("Divide", 3.1 , result);
    }

    public void percentTest(){
        double result = calculator.percent(15,56.6);
        checkResult("Percentage", 8.49 , result);
    }
}
