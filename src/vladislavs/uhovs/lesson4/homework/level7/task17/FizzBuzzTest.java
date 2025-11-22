package vladislavs.uhovs.lesson4.homework.level7.task17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.failTest();

    }

    public void fizzTest(){
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        String realResult = fizzBuzz1.detect(9);

        if (expectedResult.equals(realResult)){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void buzzTest(){
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        String realResult = fizzBuzz1.detect(10);

        if (expectedResult.equals(realResult)){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void fizzBuzzTest(){
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        String realResult = fizzBuzz1.detect(30);

        if (expectedResult.equals(realResult)){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void failTest(){
        int number = 19;
        String expectedResult = "19";
        FizzBuzz fizzBuzz1 = new FizzBuzz();
        String realResult = fizzBuzz1.detect(number);

        if (expectedResult.equals(realResult)){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
}
