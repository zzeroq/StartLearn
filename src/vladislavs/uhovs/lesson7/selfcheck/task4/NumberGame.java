package vladislavs.uhovs.lesson7.selfcheck.task4;

import java.util.Arrays;
import java.util.Random;

public class NumberGame {

    Random random;

    public NumberGame(Random random) {
        this.random = random;
    }

    public int[] arrayRandom(int length){
        int[] guessNumber = new int[length];
        for (int i = 0; i < length ; i++) {
            guessNumber[i] = random.nextInt(10);
        }
        return guessNumber;
    }

    public boolean arraysIfEquals(int[] inputNumber, int[] guessNumber){
        return Arrays.equals(inputNumber, guessNumber);
    }

}
