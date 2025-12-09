package vladislavs.uhovs.lesson5.selfCheck.level5.guessNumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GuessNumbersGameProperTests {
    private final GuessNumbersGame guessNumbersGame = new GuessNumbersGame();

    @Test
    void inRangeTest(){

        int[] realResult = guessNumbersGame.getArray(100);
        for (int n : realResult){
            assertTrue(n >= 0 && n < 10, "Value out of range: " + n);
        }
    }

    @Test
    void maskTest(){
        int[] inputArray = {1,5,8,2,0};
        int[] realResult = {1,7,8,3,0};
        String mask = guessNumbersGame.buildMask(inputArray,realResult);
        String expectedResult = "1 _ 8 _ 0";
        assertEquals(expectedResult,mask);
    }

    @Test
    void ifWinTest(){
        int[] inputArray = {1,7,8,3,0};
        int[] realResult = {1,7,8,3,0};
        boolean ifWin = guessNumbersGame.ifWin(inputArray,realResult);
        assertTrue(ifWin);
    }

    @Test
    void ifLoseTest(){
        int[] inputArray = {1,0,8,3,0};
        int[] realResult = {1,7,8,3,0};
        boolean ifLose = guessNumbersGame.ifWin(inputArray,realResult);
        assertFalse(ifLose);
    }
}
