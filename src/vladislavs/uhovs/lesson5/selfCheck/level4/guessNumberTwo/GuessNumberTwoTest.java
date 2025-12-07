package vladislavs.uhovs.lesson5.selfCheck.level4.guessNumberTwo;

import java.util.Random;

public class GuessNumberTwoTest {
    GuessNumberTwo guessNumberTwo = new GuessNumberTwo(new Random(0));
    public static void main(String[] args) {

        GuessNumberTwoTest guessNumberTwoTest = new GuessNumberTwoTest();
        guessNumberTwoTest.inRandom();
        guessNumberTwoTest.inRange();
        guessNumberTwoTest.zeroInRandom();

    }

    public void checkResult(String testName, int expectedResult, int realResult){
        System.out.println("Random number is: " + expectedResult);
        if (expectedResult == realResult){
            System.out.println(testName + " test: OK!" );
        }else if (expectedResult >= 0 && expectedResult < 101){
            System.out.println(testName + " test: OK!");
        }else {
            System.out.println(testName + " test: FAIL");
        }
        System.out.println();
    }

    public void inRandom(){
        int expectedResult = guessNumberTwo.getRandom(101);
        checkResult("In random", expectedResult, 67);
    }

    public void inRange(){
        int expectedResult = guessNumberTwo.getRandom(101);
        checkResult("In range", expectedResult, 40);
    }

    boolean isZero = true;
    public void zeroInRandom(){
        int expectedResult = guessNumberTwo.getRandom(1);
        for (int i = 0; i < 100; i++) {
            expectedResult = guessNumberTwo.getRandom(1);
            if (expectedResult != 0){
                System.out.println("Random number: " + expectedResult);
                System.out.println("Is zero test: FAIL!");
                isZero = false;
                break;
            }
        }
        if(isZero) {
            checkResult("Is zero", expectedResult, 0);
        }
    }
}
