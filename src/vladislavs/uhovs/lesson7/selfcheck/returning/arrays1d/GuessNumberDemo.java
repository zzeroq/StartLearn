package vladislavs.uhovs.lesson7.selfcheck.returning.arrays1d;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberDemo {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int[] findNumber = new int[5];
        int[] fillNumber = new int[5];
        boolean[] guessPosition = new boolean[5];

        for (int i = 0; i < findNumber.length; i++) {
            findNumber[i] = random.nextInt(10);
        }
        System.out.println("Find 5 numbers from 0 to 9!");
        int maxTries = 5;
        for (int a = 0; a < maxTries; a++) {
            System.out.println("Tries left: " + (maxTries - a));
            for (int i = 0; i < fillNumber.length; i++) {
                if (guessPosition[i]){
                    continue;
                }
                System.out.println("Input number - " + (i + 1));
                if (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Wrong input! Input only numbers!");
                    i--;
                    continue;
                }
                fillNumber[i] = input.nextInt();
                if (fillNumber[i] > 9 || fillNumber[i] < 0) {
                    System.out.println("Wrong input! Input only numbers from 0 to 9!");
                    i--;
                    continue;
                }
                if (findNumber[i] == fillNumber[i]) {
                    guessPosition[i] = true;
                    System.out.println("You found the number");
                } else if (findNumber[i] > fillNumber[i]) {
                    System.out.println("Your number is too small");
                } else {
                    System.out.println("Your number is too big");
                }
            }
            if (Arrays.equals(findNumber, fillNumber)){
                System.out.println("Congratulation you won!");
                break;
            }else if (a == maxTries - 1){
                System.out.println("Sorry you lost!");
            }
        }
        input.close();
        System.out.println("Numbers to find was - " + Arrays.toString(findNumber));
        System.out.println("Your last guess was - " + Arrays.toString(fillNumber));
    }
}
