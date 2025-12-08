package vladislavs.uhovs.lesson5.selfCheck.level5.guessNumbers;

import java.util.Random;

public class GuessNumbersGameTest {
    private final GuessNumbersGame guessNumbersGame = new GuessNumbersGame(new Random(0));
    public static void main(String[] args) {

        GuessNumbersGameTest guessNumbersGameTest = new GuessNumbersGameTest();

        guessNumbersGameTest.inRange();
        guessNumbersGameTest.maskTest();
        guessNumbersGameTest.ifWinTest();
        guessNumbersGameTest.ifLoseTest();

    }

    public void inRange() {
        boolean ifRange = true;
        int[] realResult = guessNumbersGame.getArray(100);
        for (int n : realResult) {
            if (n < 0 || n > 9) {
                System.out.println("In range test: FAIL!");
                ifRange = false;
                break;
            }
        }
        if (ifRange) {
            System.out.println("In range test: OK!");
        }
    }

    public void maskTest(){
        int[] inputArray = {1,5,8,2,0};
        int[] realResult = {1,7,8,3,0};
        String mask = guessNumbersGame.buildMask(inputArray,realResult);
        String expectedResult = "1 _ 8 _ 0";

        if(mask.equals(expectedResult)){
            System.out.println("Mask test: OK!");
        }else {
            System.out.println("Mask test: Fail!");
        }
    }

    public void ifWinTest(){
        int[] expectedResult = {5,8,1,7,7};
        int[] realResult = {5,8,1,7,7};
        boolean ifWin = guessNumbersGame.ifWin(expectedResult, realResult);
        if (ifWin){
            System.out.println("If win test: OK!");
        }else{
            System.out.println("If win test: FAIL!");
        }
    }
    public void ifLoseTest(){
        int[] expectedResult = {0,8,1,7,7};
        int[] realResult = {5,8,1,7,7};
        boolean ifWin = guessNumbersGame.ifWin(expectedResult, realResult);
        if (!ifWin){
            System.out.println("If lose test: OK!");
        }else{
            System.out.println("If lose test: FAIL!");
        }
    }
}


