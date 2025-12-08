package vladislavs.uhovs.lesson5.selfCheck.level5.guessNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumbersGameDemo {
    public static void main(String[] args) {

        GuessNumbersGame guessNumbersGame = new GuessNumbersGame();
        Scanner input = new Scanner(System.in);
        int maxTries = 10;

        int[] numbersToFind = guessNumbersGame.getArray(5);
        int[] guess = {-1, -1, -1, -1, -1};

                try {
                    System.out.println("Game start!");
                    Thread.sleep(1000);
                    System.out.println("Find the right numbers in " + maxTries + " tries!");
                    Thread.sleep(1000);
                    System.out.println("Each number are from 0 to 9!");
                    Thread.sleep(1000);
                    System.out.println("Input numbers!" + " Numbers length = " + numbersToFind.length);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }

        for (int a = 0; a < maxTries; a++) {
            for (int i = 0; i < guess.length; i++) {
                if (i < 1) {
                    System.out.println();
                    System.out.println("Please guess the numbers!" + " Tries left - " + (maxTries - a));
                }
                System.out.println("Numbers count - " + (i+1));
                if (!input.hasNextInt()){
                    System.out.println("Error! You must enter a NUMBER!!!");
                    System.out.println("You can try again.");
                    System.out.println();
                    input.next();
                    i--;
                }else{
                    int value = input.nextInt();
                    if (value > 9 || value < 0){
                        System.out.println("ERROR!");
                        System.out.println("Number input wasn't possible!");
                        System.out.println("You can try again.");
                        System.out.println();
                        i--;
                    } else {
                        guess[i] = value;
                        if (guess[i] > numbersToFind[i]) {
                            System.out.println("Number is too big.");
                            System.out.println();
                        } else if (guess[i] < numbersToFind[i]){
                            System.out.println("Number is too small.");
                            System.out.println();
                        } else if (numbersToFind[i] == guess[i]){
                            System.out.println("You found one!");
                            System.out.println();
                        }
                    }
                }

            }
            System.out.println(guessNumbersGame.buildMask(numbersToFind, guess));
            System.out.println();
            System.out.println("Your last input was: " + Arrays.toString(guess));
            if (guessNumbersGame.ifWin(numbersToFind,guess)){
                System.out.println();
                System.out.println("Congratulation!!! You are the WINNER!");
                break;
            }
        }
        if (!guessNumbersGame.ifWin(numbersToFind,guess)){
            System.out.println();
            System.out.println("Sorry you LOSE! The number was: " + Arrays.toString(numbersToFind));
        }
        input.close();
    }
}

