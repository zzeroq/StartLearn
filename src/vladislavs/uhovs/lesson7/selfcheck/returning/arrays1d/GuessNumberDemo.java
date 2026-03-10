package vladislavs.uhovs.lesson7.selfcheck.returning.arrays1d;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();

        int[] findNumber = new int[5];
        boolean[] guessPosition = new boolean[findNumber.length];
        int count = 0;
        int guess = 0;

        guessNumber.arrayFindNumberFilled(findNumber);
        System.out.println("Numbers to find was - " + Arrays.toString(findNumber));
        System.out.println("Find " + findNumber.length +  " numbers from 0 to 9!");
        int maxTries = 5;
        for (int a = 0; a < maxTries; a++) {
            System.out.println("Tries left: " + (maxTries - a));
            for (int i = 0; i < findNumber.length; i++) {
                if (guessPosition[i]){
                    continue;
                }
                System.out.println("Input number - " + (i + 1));
                boolean correctInput = false;
                while (!correctInput) {
                    if (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Wrong input! Input only numbers!");
                        continue;
                    }
                    guess = input.nextInt();
                    if (guessNumber.inRange(guess)) {
                        System.out.println("Wrong input! Input only numbers from 0 to 9!");
                        continue;
                    }
                    correctInput = true;
                }
                if (guessNumber.ifGuess(findNumber, i, guess)) {
                    count++;
                    guessPosition[i] = true;
                    System.out.println("You found the number");
                } else if (guessNumber.tooSmall(findNumber, i, guess)) {
                    System.out.println("Your number is too small");
                } else {
                    System.out.println("Your number is too big");
                }
            }
            if (guessNumber.ifWin(count, findNumber.length)){
                System.out.println("Congratulation! You win!");
                break;
            }else if (guessNumber.ifLose(a, maxTries - 1)){
                System.out.println("Sorry, you lose!");
            }
            System.out.println(guessNumber.mask(findNumber, guess));
        }
        System.out.println(guessNumber.mask(findNumber, guess));
        input.close();
        System.out.println("Numbers to find was - " + Arrays.toString(findNumber));
    }
}
