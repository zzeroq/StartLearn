package vladislavs.uhovs.lesson4.homework.level4.tasks10to14;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.compareNumbersTest();
        calculatorTest.compareNumbersTest2();
        calculatorTest.compareNumbersTest3();
        calculatorTest.biggestNumberTest();
        calculatorTest.biggestNumberTest2();
        calculatorTest.biggestNumberTest3();
        calculatorTest.biggestNumberTest4();
        calculatorTest.biggestNumberTest5();
        calculatorTest.biggestNumberTest6();
        calculatorTest.biggestNumberTest7();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void isEvenTest(){
        int number = 10;
        boolean expecterResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expecterResult){
            System.out.println("IsEven test = OK!");
        }else{
            System.out.println("IsEven test = FAIL!");
        }
    }
    public void compareNumbersTest(){
        int number1 = 5;
        int number2 = 10;
        int expectedResult = number2;
        Calculator calculator = new Calculator();
        int realResult = calculator.compareNumbers(number1,number2);
        if (realResult == expectedResult){
            System.out.println("Compare numbers test = OK! ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }

    }
    public void compareNumbersTest2(){
        int number1 = 15;
        int number2 = 10;
        int expectedResult = number1;
        Calculator calculator = new Calculator();
        int realResult = calculator.compareNumbers(number1,number2);
        if (realResult == expectedResult){
            System.out.println("Compare numbers test = OK! ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }
    }
    public void compareNumbersTest3(){
        int number1 = 10;
        int number2 = 10;
        int expectedResult = number1;
        Calculator calculator = new Calculator();
        int realResult = calculator.compareNumbers(number1,number2);
        if (realResult == expectedResult && number1 == number2){
            System.out.println("Compare numbers test = OK!(Equal) ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }
    }
    public void biggestNumberTest(){
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int expectedResult = number1;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number1 != number2 && number1 != number3 ){
            System.out.println("Compare numbers test = OK! ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }
    }
    public void biggestNumberTest2(){
        int number1 = 50;
        int number2 = 60;
        int number3 = 30;
        int expectedResult = number2;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number1 != number2 && number2 != number3 ){
            System.out.println("Compare numbers test = OK! ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }
    }
    public void biggestNumberTest3(){
        int number1 = 25;
        int number2 = 60;
        int number3 = 70;
        int expectedResult = number3;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number1 != number3 && number2 != number3 ){
            System.out.println("Compare numbers test = OK! ");
        }else {
            System.out.println("Compare numbers test = FAIL! ");
        }
    }
    public void biggestNumberTest4(){
        int number1 = 80;
        int number2 = 80;
        int number3 = 70;
        int expectedResult = number1;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number2 != number3 && number1 == number2){
            System.out.println("Compare numbers test = OK!(number1 and number2 are equal) ");
        }else {
            System.out.println("Compare numbers test = FAIL!(number1 and number2 must be equal) ");
        }
    }
    public void biggestNumberTest5(){
        int number1 = 80;
        int number2 = 50;
        int number3 = 80;
        int expectedResult = number1;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number2 != number3 && number1 == number3){
            System.out.println("Compare numbers test = OK!(number1 and number3 are equal) ");
        }else {
            System.out.println("Compare numbers test = FAIL!(number1 and number3 must be equal) ");
        }
    }
    public void biggestNumberTest6(){
        int number1 = 30;
        int number2 = 80;
        int number3 = 80;
        int expectedResult = number2;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number1 != number3 && number2 == number3){
            System.out.println("Compare numbers test = OK!(number2 and number3 are equal) ");
        }else {
            System.out.println("Compare numbers test = FAIL!(number2 and number3 must be equal) ");
        }
    }
    public void biggestNumberTest7(){
        int number1 = 80;
        int number2 = 80;
        int number3 = 80;
        int expectedResult = number2;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestNumber(number1,number2,number3);
        if (realResult == expectedResult && number1 == number3 && number2 == number3){
            System.out.println("Compare numbers test = OK!(All numbers are equal) ");
        }else {
            System.out.println("Compare numbers test = FAIL!(All numbers must be equal) ");
        }
    }
}

