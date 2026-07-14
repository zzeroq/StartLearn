package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[] result = new String[5];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean isPositiveResult = true;
        SlotMachine slotMachine = new SlotMachine();
        int balance = 0;
        int spinCost = 1;

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
            System.out.println("Press 1 to play, 2 to cashout, 3 to change spin cost");
            System.out.println("Spin Cost: " + spinCost);
            System.out.println("Cashout: " + balance);
            int ifPlayYes = input.nextInt();
            if (ifPlayYes == 1 && balance > 1) {
                slotMachine.slots(fruit, result, random);
                balance = slotMachine.spinCost(balance, spinCost);
                isPositiveResult = true;
                System.out.println("Your balance: " + balance);
                System.out.println(Arrays.toString(result));
                int count = 1;
                for (int i = 0; i < result.length - 1; i++) {
                    if (result[i].equals(result[i + 1])) {
                        count++;
                    } else {
                        break;
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
            } else {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + balance);
                isPositiveResult = false;
            }
        } while (isPositiveResult);
    }
}
