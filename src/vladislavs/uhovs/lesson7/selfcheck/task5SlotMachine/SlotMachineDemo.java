package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};
        String[][] result = new String[5][5];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean isPositiveResult = true;
        SlotMachine slotMachine = new SlotMachine();
        long balance = 0;
        long spinCost = 100;
        int row = 5;
        int column = 5;
        int multiply = 1;

        do {
            System.out.println("To play, you need to deposit minimum 10 usd, press D if you want to deposit more");
            System.out.println("After deposit press any key to play slot machine");
            String isDepositYes = input.next();
            if (isDepositYes.equalsIgnoreCase("D")) {
                System.out.println("Deposit amount");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Wrong input! Only numbers allowed, input again");
                }
                int deposit = input.nextInt();
                balance = slotMachine.deposit(balance, deposit) * 100;
                System.out.println("Your balance: " + ((double) balance / 100) + " USD");
            } else if (balance >= 10) {
                isPositiveResult = false;
            }

        } while (isPositiveResult);

        do {
            System.out.println("Press 1 to SPIN, 2 to CASHOUT, 3 to CHANGE spin cost");
            System.out.println("Spin Cost: " + ((double) spinCost / 100) + " USD");
            System.out.println("Cashout: " + ((double) balance / 100) + " USD");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only numbers allowed, input again");
            }
            int ifPlayYes = input.nextInt();
            if (ifPlayYes == 1 && balance > spinCost) {
                slotMachine.slots(fruit, result, random, row, column);
                balance = slotMachine.spinCostSubstraction(balance, spinCost);
                isPositiveResult = true;
                System.out.println("Your balance: " + ((double) balance / 100) + " USD");
                for (String[] strings : result) {
                    System.out.println(Arrays.toString(strings));
                }
                int count;

                for (int r = 0; r < row; r++) {
                    count = 1;
                    for (int c = 0; c < column - 1; c++) {
                        if (result[r][c].equals(result[r][c + 1])) {
                            count++;

                        } else {
                            break;
                        }
                    }
                    if (count == 5) {
                        balance = slotMachine.winningMoney(balance, 1860, multiply);
                        System.out.println("Won:" + ((double) spinCost * 18.60 / 100) + " USD");
                        System.out.println("Balance now: " + ((double) balance / 100) + " USD");
                    } else if (count == 4) {
                        balance = slotMachine.winningMoney(balance, 1000, multiply);
                        System.out.println("Won:" + ((double) spinCost * 10 / 100) + " USD");
                        System.out.println("Balance now: " + ((double) balance / 100) + " USD");
                    } else if (count == 3) {
                        balance = slotMachine.winningMoney(balance, 100, multiply);
                        System.out.println("Won:" + ((double) spinCost * 1 / 100) + " USD");
                        System.out.println("Balance now: " + ((double) balance / 100) + " USD");
                    } else if (count == 2) {
                        balance = slotMachine.winningMoney(balance, 40, multiply);
                        System.out.println("Won:" + ((double) spinCost * 0.40 / 100) + " USD");
                        System.out.println("Balance now: " + ((double) balance / 100) + " USD");
                    }
                }

            } else if (ifPlayYes == 3) {
                System.out.println("Input spin cost");
                multiply = input.nextInt();
                spinCost = 100L * multiply;
                isPositiveResult = true;
            } else if (ifPlayYes == 2) {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + ((double) balance / 100) + " USD");
                isPositiveResult = false;
            } else if (spinCost > balance) {
                System.out.println("Not enough funds");
            } else {
                System.out.println("Wrong input try again");
                isPositiveResult = true;
            }
        } while (isPositiveResult);
    }
}
