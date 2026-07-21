package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    private static final int ROW = 5;
    private static final int COLUMN = 5;
    private static final int CENTS_IN_USD = 100;
    private static final int TWO_ROW_WIN = 40;
    private static final int THREE_ROW_WIN = 100;
    private static final int FOUR_ROW_WIN = 1000;
    private static final int FIVE_ROW_WIN = 1860;
    private static final int MINIMUM_BALANCE = 10;
    private static final long START_SPIN_COST = 100;

    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};

        String[][] result = new String[ROW][COLUMN];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean continueGame = true;
        SlotMachine slotMachine = new SlotMachine();
        long balance = 0;
        long spinCost = START_SPIN_COST;
        int multiply = 1;
        long deposit;

        do {
            System.out.println("You need a minimum balance of 10 USD to play, press D if you want to deposit more");
            System.out.println("After deposit press Start - S key to play slot machine");
            System.out.println("Your balance: " + ((double) balance / CENTS_IN_USD) + " USD");
            String depositChoice = input.next();
            if (depositChoice.equalsIgnoreCase("D")) {
                System.out.println("Deposit amount");
                do {
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
                    }
                    deposit = input.nextInt();
                    if (deposit < 0){
                        System.out.println("You can't deposit a negative amount");
                    } else if (deposit == 0) {
                        System.out.println("You can't deposit zero");
                    }
                } while (deposit <= 0);
                balance += deposit * CENTS_IN_USD;
            } else if (balance >= MINIMUM_BALANCE && depositChoice.equalsIgnoreCase("S")) {
                continueGame = false;
            }
        } while (continueGame);

        do {
            System.out.println("Press 1 to SPIN, 2 to CASHOUT, 3 to CHANGE spin cost");
            System.out.println("Spin Cost: " + ((double) spinCost / CENTS_IN_USD) + " USD");
            System.out.println("Cashout: " + ((double) balance / CENTS_IN_USD) + " USD");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
            }
            int menuChoice = input.nextInt();
            if (menuChoice == 1 && balance >= spinCost) {
                slotMachine.slots(fruit, result, random, ROW, COLUMN);
                balance -= spinCost;
                continueGame = true;
                System.out.println("Your balance: " + ((double) balance / CENTS_IN_USD) + " USD");
                for (String[] strings : result) {
                    System.out.println(Arrays.toString(strings));
                }
                int count;

                for (int r = 0; r < ROW; r++) {
                    count = 1;
                    for (int c = 0; c < COLUMN - 1; c++) {
                        if (result[r][c].equals(result[r][c + 1])) {
                            count++;

                        } else {
                            break;
                        }
                    }
                    if (count == 5) {
                        balance = slotMachine.winningMoney(balance, FIVE_ROW_WIN, multiply);
                        System.out.println("Won: " + ((double) spinCost / CENTS_IN_USD * FIVE_ROW_WIN / CENTS_IN_USD) + " USD");
                        System.out.println("Balance now: " + ((double) balance / CENTS_IN_USD) + " USD");
                    } else if (count == 4) {
                        balance = slotMachine.winningMoney(balance, FOUR_ROW_WIN, multiply);
                        System.out.println("Won: " + (((double) spinCost / CENTS_IN_USD) * (FOUR_ROW_WIN / CENTS_IN_USD)) + " USD");
                        System.out.println("Balance now: " + ((double) balance / CENTS_IN_USD) + " USD");
                    } else if (count == 3) {
                        balance = slotMachine.winningMoney(balance, THREE_ROW_WIN, multiply);
                        System.out.println("Won: " + ((double) spinCost / CENTS_IN_USD * THREE_ROW_WIN / CENTS_IN_USD) + " USD");
                        System.out.println("Balance now: " + ((double) balance / CENTS_IN_USD) + " USD");
                    } else if (count == 2) {
                        balance = slotMachine.winningMoney(balance, TWO_ROW_WIN, multiply);
                        System.out.println("Won: " + ((double) spinCost / CENTS_IN_USD * TWO_ROW_WIN / CENTS_IN_USD) + " USD");
                        System.out.println("Balance now: " + ((double) balance / CENTS_IN_USD) + " USD");
                    }
                }

            } else if (menuChoice == 3) {
                System.out.println("Input spin cost");
                do {
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
                    }
                    multiply = input.nextInt();
                    if (multiply < 0){
                        System.out.println("You can't input a negative number");
                    } else if (multiply == 0) {
                        System.out.println("You can't input zero");
                    } else if (multiply > balance){
                        System.out.println("Spin cost cannot exceed your balance.");
                    }
                } while (multiply <= 0 && multiply > balance);
                spinCost = START_SPIN_COST * multiply;
                continueGame = true;
            } else if (menuChoice == 2) {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + ((double) balance / CENTS_IN_USD) + " USD");
                continueGame = false;
            } else if (spinCost > balance) {
                System.out.println("Not enough funds");
            } else {
                System.out.println("Wrong input try again");
                continueGame = true;
            }
        } while (continueGame);
    }
}
