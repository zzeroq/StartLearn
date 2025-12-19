package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        TicTacToe ticTacToe = new TicTacToe(input,random);
        ticTacToe.play();
    }
}
