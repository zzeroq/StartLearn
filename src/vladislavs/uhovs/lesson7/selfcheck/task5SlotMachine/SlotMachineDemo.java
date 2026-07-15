package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[][] result = new String[5][5];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean isPositiveResult = true;
        SlotMachine slotMachine = new SlotMachine();
        int balance = 0;
        int spinCost = 1;
        int row = 5;
        int column = 5;

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
                balance = slotMachine.deposit(balance, deposit);
                System.out.println("Your balance: " + balance);
            } else if (balance >= 10) {
                isPositiveResult = false;
            }

        } while (isPositiveResult);

        do {
            System.out.println("Press 1 to SPIN, 2 to CASHOUT, 3 to CHANGE spin cost");
            System.out.println("Spin Cost: " + spinCost);
            System.out.println("Cashout: " + balance);
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only numbers allowed, input again");
            }
            int ifPlayYes = input.nextInt();
            if (ifPlayYes == 1 && balance > 1) {
                slotMachine.slots(fruit, result, random, row, column);
                balance = slotMachine.spinCost(balance, spinCost);
                isPositiveResult = true;
                System.out.println("Your balance: " + balance);
                for (String[] strings : result) {
                    System.out.println(Arrays.toString(strings));
                }
                int count = 1;

                for (int r = 0; r < row; r++) {
                    count = 1;
                    for (int c = 0; c < column - 1; c++) {
                        if (result[r][c].equals(result[r][c + 1])) {
                            count++;

                        } else {
                            break;
                        }
                    }
                }

                if (count == 5) {
                    balance = slotMachine.winningMoney(balance, spinCost, 93);
                    System.out.println("Won:" + (spinCost * 93));
                    System.out.println("Balance now: " + balance);
                } else if (count == 4) {
                    balance = slotMachine.winningMoney(balance, spinCost, 50);
                    System.out.println("Won:" + (spinCost * 50));
                    System.out.println("Balance now: " + balance);
                } else if (count == 3) {
                    balance = slotMachine.winningMoney(balance, spinCost, 5);
                    System.out.println("Won:" + (spinCost * 5));
                    System.out.println("Balance now: " + balance);
                } else if (count == 2) {
                    balance = slotMachine.winningMoney(balance, spinCost, 2);
                    System.out.println("Won:" + (spinCost * 2));
                    System.out.println("Balance now: " + balance);
                }
                System.out.println(count);
            } else if (ifPlayYes == 3) {
                System.out.println("Input spin cost");
                spinCost = input.nextInt();
                isPositiveResult = true;
            } else if (ifPlayYes == 2) {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + balance);
                isPositiveResult = false;
            } else {
                System.out.println("Wrong input try again");
                isPositiveResult = true;
            }
        } while (isPositiveResult);
    }
}
