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

    public void inRandom(){
        int expectedResult = 67;
        int realResult = guessNumberTwo.getRandom(101);
        if (expectedResult == realResult){
            System.out.println("Random number: " + realResult);
            System.out.println("In test: OK!");
        }else {
            System.out.println("Random number: " + realResult);
            System.out.println("In test: Fail!");
        }
        System.out.println();
    }

    public void inRange(){
        boolean inRange = true;
        int realResult = guessNumberTwo.getRandom(101);
        for (int i = 0; i < 100; i++) {
            realResult = guessNumberTwo.getRandom(101);
            if (realResult < 0 || realResult > 100){
                System.out.println("Random number: " + realResult);
                System.out.println("In range test: FAIL!");
                inRange = false;
                break;
            }
        }
        if(inRange) {
            System.out.println("Random number: " + realResult);
            System.out.println("In range test: OK!");
        }
        System.out.println();
    }

    public void zeroInRandom(){
        boolean isZero = true;
        int realResult = guessNumberTwo.getRandom(1);
        for (int i = 0; i < 100; i++) {
            realResult = guessNumberTwo.getRandom(1);
            if (realResult != 0){
                System.out.println("Random number: " + realResult);
                System.out.println("Is zero test: FAIL!");
                isZero = false;
                break;
            }
        }
        if(isZero) {
            System.out.println("Random number: " + realResult);
            System.out.println("Is zero test: OK!");
        }
        System.out.println();
    }
}
