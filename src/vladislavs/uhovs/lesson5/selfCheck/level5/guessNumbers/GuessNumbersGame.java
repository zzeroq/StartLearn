package vladislavs.uhovs.lesson5.selfCheck.level5.guessNumbers;

import java.util.Arrays;
import java.util.Random;

public class GuessNumbersGame {
    private final Random random;

    public GuessNumbersGame(){
        this(new Random());
    }
    public GuessNumbersGame(Random random){
        this.random = random;
    }

    public int[] getArray(int length){
        int[] numbersToFind = new int[length];
        for (int i = 0; i < numbersToFind.length; i++) {
            numbersToFind[i] = random.nextInt(10);
        }
        return numbersToFind;
    }

    public String buildMask(int[] numbersToFind, int[] guess){
        StringBuilder mask = new StringBuilder();
        for (int i = 0; i < numbersToFind.length; i++) {
            if (numbersToFind[i] == guess[i]) {
                mask.append(numbersToFind[i]).append(" ");
            }else {
                mask.append("❌ "); // append same as concatenation
            }
        }
        return mask.toString().trim(); // trim removes space at the end and beginning
    }

    public boolean ifWin(int[] numberToFind, int[] guess){
        return Arrays.equals(numberToFind, guess);
    }
}
