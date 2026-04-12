package vladislavs.uhovs.lesson7.selfcheck.returning.arrays1d;

import java.util.Random;

public class GuessNumber {

    public void arrayFindNumberFilled(int[] findNumber){
        Random random = new Random();
        for (int i = 0; i < findNumber.length; i++) {
            findNumber[i] = random.nextInt(10);
        }
    }

    public boolean ifGuess(int findNumber, int inputGuess) {
        return findNumber == inputGuess;
    }

    public boolean tooSmall(int findNumber, int inputGuess) {
        return findNumber > inputGuess;
    }

    public boolean inRange(int guess){
        return  guess > 9 || guess < 0;
    }

    public boolean ifLose(int countTries, int maxTries){
        return countTries == maxTries;
    }

    public boolean ifWin(int count, int length){
        return  count == length;
    }

    public String mask(int[] toFindNumber, boolean[] foundNumber){
        StringBuilder mask = new StringBuilder();
        for (int i = 0; i < foundNumber.length; i++) {
            if (foundNumber[i]) {
                mask.append(toFindNumber[i]).append(" ");
            } else {
                mask.append("❌ ");
            }
        }
        return mask.toString().trim();
    }
}
