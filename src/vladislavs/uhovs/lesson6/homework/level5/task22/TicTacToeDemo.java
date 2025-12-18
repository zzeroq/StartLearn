package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the number and start to play, 0 / 1.");

        int[][] field = new int[3][3];
        int playersNumber = input.nextInt();
        for (int r = 0; r < field.length ; r++) {
            for (int c = 0; c < field[r].length; c++) {
                playersNumber = input.nextInt();
                field[r][c] = playersNumber;
                if (playersNumber < 0 || playersNumber > 1 ){
                    System.out.println("Wrong input! Choose 0 or 1");
                    c--;
                    continue;
                }
                System.out.println("Your number is: " + playersNumber);
            }
        }

        if (ticTacToe.isDrawPosition(field)){
            System.out.println("Draw!");
        }

        System.out.println(Arrays.toString(field[0]));
        System.out.println(Arrays.toString(field[1]));
        System.out.println(Arrays.toString(field[2]));






    }



}
