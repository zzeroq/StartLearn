package vladislavs.uhovs.lesson5.selfCheck.level4.guessNumberTwo;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTwoDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GuessNumberTwo guessNumberTwo = new GuessNumberTwo();

        int findNumber = guessNumberTwo.getRandom(101);
        boolean isGuess = false;
        int setTries = 5;
        for (int i = 0; i < setTries; i++) {
           if (i < 1){
               System.out.println("Game started!");
               System.out.println("Please guess the number from 0 to 100!");
           }
            System.out.println("Tries left: " + (setTries - i));

            int inputNumber = input.nextInt();
            if (findNumber < inputNumber){
                System.out.println("Your number is too big! TRY AGAIN!");
            } else if (findNumber > inputNumber) {
                System.out.println("Your number is too small! TRY AGAIN!");
            } else {
                System.out.println("YOU WON!!! CONGRATULATION!!! THE NUMBER WAS:" + findNumber);
                isGuess = true;
                break;
            }
        }
        if (!isGuess){
            System.out.println("YOU LOSE!!! SORRY, TRY AGAIN!!! THE NUMBER WAS: " + findNumber);
        }
        input.close();
    }
}
