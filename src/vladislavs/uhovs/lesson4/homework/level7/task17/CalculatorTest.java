package vladislavs.uhovs.lesson4.homework.level7.task17;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    private final Calculator calculator = new Calculator();

    public void checkResult(String testName, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    public void checkResultBoolean(String testName, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    public void sumTest() {
        int result = calculator.sum(35, 40);
        checkResult("Sum test", result, 75);

    }

    public void subTest() {
        int result = calculator.sub(35, 15);
        checkResult("Sub test", result, 20);
    }

    public void mulTest() {
        int result = calculator.mul(5, 5);
        checkResult("Multiply test", result, 25);
    }

    public void divTest() {
        int result = calculator.div(40, 8);
        checkResult("Divide test", result, 5);
    }

    public void isEvenTest1() {
        boolean result = calculator.isEven(40);
        checkResultBoolean("Is even test", result, true);
    }

    public void isEvenTest2() {
        boolean result = calculator.isEven(41);
        checkResultBoolean("Not even test", result, false);
    }
}
