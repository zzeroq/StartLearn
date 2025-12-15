package vladislavs.uhovs.lesson5.selfCheck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] findNumber = new int[5];
        int[] inputNumber = new int[5];
        int iteration = 0;
        int maxTries = 5;

        for (int i = 0; i < findNumber.length; i++) {
            findNumber[i] = random.nextInt(10);
        }

        System.out.println("Start the game!");
        System.out.println("Maximum tries " + maxTries);
        do {
            StringBuilder mask = new StringBuilder();
            if (iteration != 0){
                System.out.println("You didn't guess all numbers! Try again");
                System.out.println("Tries left: " + (maxTries - iteration));
            }
            for (int i = 0; i < inputNumber.length; i++) {
                System.out.println("Input number " + (i + 1) + " from 0 to 9: ");
                if (!input.hasNextInt()){
                    System.out.println("ERROR! You must enter the NUMBER!");
                    System.out.println("Try again!");
                    input.next();
                    i--;
                    continue;
                }
                inputNumber[i] = input.nextInt();
                if (inputNumber[i] < 0 || inputNumber[i] > 9) {
                    System.out.println("Wrong Input! Try again!");
                    i--;
                    continue;
                }else if (inputNumber[i] > findNumber[i]) {
                    System.out.println("Too big");
                    System.out.println();
                }else if (inputNumber[i] < findNumber[i]) {
                    System.out.println("Too small");
                    System.out.println();
                }else{
                    System.out.println("You found one!");
                    System.out.println();
                }
                if (findNumber[i] == inputNumber[i]){
                    mask.append(findNumber[i]).append(" ");
                }else {
                    mask.append("❌ ");
                }
            }
            System.out.println(mask);

            iteration++;
        } while (iteration < maxTries && !Arrays.equals(findNumber, inputNumber));
        input.close();

        if (Arrays.equals(findNumber, inputNumber)){
            System.out.println();
            System.out.println("Congratulation!!! You won!");
        } else{
            System.out.println();
            System.out.println("SORRY! You lose!");
        }
    }
}
