package vladislavs.uhovs.lesson7.selfcheck.returning.arrays1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberTest {

    GuessNumber guessNumber;

    @BeforeEach
    public void setUp(){
        guessNumber = new GuessNumber();
    }

    @Test
    @DisplayName("Should return true if input number is the same as find number")
    public void ifGuess(){
        int findNumber = 0;
        int inputNumber = 0;
        assertTrue(guessNumber.ifGuess(findNumber, inputNumber));
    }

    @Test
    @DisplayName("Should return false if input number is the same as find number")
    public void ifNotGuess(){
        int findNumber = 9;
        int inputNumber = 0;
        assertFalse(guessNumber.ifGuess(findNumber, inputNumber));
    }

    @Test
    @DisplayName("Should return true if input number is too small compare to find number")
    public void ifTooSmall(){
        int findNumber = 9;
        int inputNumber = 0;
        assertTrue(guessNumber.tooSmall(findNumber, inputNumber));
    }

    @Test
    @DisplayName("Should return false if input number is not smaller compare to find number")
    public void ifNotTooSmall(){
        int findNumber = 9;
        int inputNumber = 9;
        assertFalse(guessNumber.tooSmall(findNumber, inputNumber));
    }

    @Test
    @DisplayName("Should return true if negative input number is out of range from 0 to 9")
    public void ifOutOfRange(){
        int inputNumber = -1;
        assertTrue(guessNumber.inRange(inputNumber));
    }

    @Test
    @DisplayName("Should return true if MIN value input number is out of range from 0 to 9")
    public void ifOutOfRangeMinValue(){
        int inputNumber = Integer.MIN_VALUE;
        assertTrue(guessNumber.inRange(inputNumber));
    }

    @Test
    @DisplayName("Should return true if MIN value input number is out of range from 0 to 9")
    public void ifOutOfRangeMaxValue(){
        int inputNumber = Integer.MAX_VALUE;
        assertTrue(guessNumber.inRange(inputNumber));
    }

    @Test
    @DisplayName("Should return false if input number is in range from 0 to 9")
    public void ifInRange(){
        int inputNumber = 5;
        assertFalse(guessNumber.inRange(inputNumber));
    }

    @Test
    @DisplayName("Should return true if count tries number are equals to max tries number, that means game is lost")
    public void ifLost(){
        int countTries = Integer.MAX_VALUE;
        int maxTries = Integer.MAX_VALUE;
        assertTrue(guessNumber.ifLose(countTries, maxTries));
    }

    @Test
    @DisplayName("Should return false if count tries number are not equals to max tries number, that means game is not lost")
    public void ifNotLost(){
        int countTries = Integer.MIN_VALUE;
        int maxTries = 5;
        assertFalse(guessNumber.ifLose(countTries, maxTries));
    }

    @Test
    @DisplayName("Should return true if count correct guess number equals to correct length guess number, that means game is won")
    public void ifWin(){
        int countTries = Integer.MAX_VALUE;
        int maxTries = Integer.MAX_VALUE;
        assertTrue(guessNumber.ifWin(countTries, maxTries));
    }

    @Test
    @DisplayName("Should return false if count correct guess number are not equal to correct length guess number")
    public void ifNotWin(){
        int countTries = Integer.MIN_VALUE;
        int maxTries = Integer.MAX_VALUE;
        assertFalse(guessNumber.ifWin(countTries, maxTries));
    }

    @Test
    @DisplayName("Expected result must be equals to mask result")
    public void mask(){
        int[] toFindNumber = {3,6,5};
        int[] inputNumber = {3,7,5};
        String expectedResult = "3 ❌ 5";
        assertEquals(expectedResult, guessNumber.mask(toFindNumber,inputNumber));
    }

}
