package vladislavs.uhovs.lesson7.selfcheck.task4;

import java.util.Random;
import java.util.Scanner;

public class NumbersGameDemo {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame(new Random());
        Scanner input = new Scanner(System.in);
        int[] guessNumber = numberGame.arrayRandom(4);
        int[] toFindNumber = new int[guessNumber.length];

        int tries = 5;
        System.out.println("Guess the numbers from 0 to 9!");
        for (int i = 0; i < tries; i++) {
            System.out.println("Your tries left: " + (tries - i));
            for (int j = 0; j < toFindNumber.length; j++) {
                if (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Wrong Input! Input ONLY numbers from 0 to 9!");
                    j--;
                }else {
                    toFindNumber[j] = input.nextInt();
                    if (toFindNumber[j] < 0 || toFindNumber[j] > 9) {
                        System.out.println("Wrong Input! Input numbers from 0 to 9!");
                        j--;
                        continue;

                    }
                    if (toFindNumber[j] == guessNumber[j]) {
                        System.out.println("You found the number");
                    } else if (toFindNumber[j] < guessNumber[j]) {
                        System.out.println("Number is too small");
                    } else {
                        System.out.println("Number is to big");
                    }
                }
            }
            if (numberGame.arraysIfEquals(guessNumber, toFindNumber)) {
                break;
            }
        }
        if (numberGame.arraysIfEquals(guessNumber, toFindNumber)){
            System.out.println("Congratulations! you WON!");
        }else {
            System.out.println("Sorry, You lost!");
        }
    }
}
