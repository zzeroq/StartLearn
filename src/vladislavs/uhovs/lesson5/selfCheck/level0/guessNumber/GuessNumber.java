package vladislavs.uhovs.lesson5.selfCheck.level0.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int findNumber = random.nextInt(101);
        boolean isGuessed = false;

        int maxTries = 5;
        for (int i = 0; i < maxTries; i++) {
            System.out.println("Enter number from 0 to 100!" + " Tries Left: " + (maxTries - i));
            int inputNumber = input.nextInt();

            if (findNumber > inputNumber){
                System.out.println("Too small...he he he!");
            }else if (findNumber < inputNumber){
                System.out.println("Too big...he he he!");
            }else {
                System.out.println("WINNER!! Number was: " + findNumber);
                isGuessed = true;
                break;
            }
        }
        if (!isGuessed){
            System.out.println("YOU LOSE! Try again!");
            System.out.println("Number was: " + findNumber);
        }
        input.close();
    }
}
