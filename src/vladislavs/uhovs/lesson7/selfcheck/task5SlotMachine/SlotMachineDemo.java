package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    private static final int SLOT_ROWS = 5;
    private static final int SLOT_COLUMNS = 5;
    private static final int CENTS_IN_USD = 100;
    private static final int TWO_ROW_WIN = 40;
    private static final int THREE_ROW_WIN = 100;
    private static final int FOUR_ROW_WIN = 1000;
    private static final int FIVE_ROW_WIN = 1860;
    private static final int MINIMUM_BALANCE_CENTS = 1000;
    private static final long START_SPIN_COST = 100;
    private static final int TWO_EVEN_SYMBOLS_COUNT = 2;
    private static final int THREE_EVEN_SYMBOLS_COUNT = 3;
    private static final int FOUR_EVEN_SYMBOLS_COUNT = 4;
    private static final int FIVE_EVEN_SYMBOLS_COUNT = 5;

    private static long depositAmount(Scanner input) {
        long value;
        System.out.println("Deposit amount");
        do {
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
            }
            value = input.nextInt();
            if (value < 0) {
                System.out.println("You can't deposit a negative amount");
            } else if (value == 0) {
                System.out.println("You can't deposit zero");
            }
        } while (value <= 0);
        return value;
    }


    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};


        String[][] result = new String[SLOT_ROWS][SLOT_COLUMNS];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean continueGame = true;
        SlotMachine slotMachine = new SlotMachine(0, START_SPIN_COST, fruit, result, random);

        int multiply = 1;

        do {
            System.out.println("You need a minimum balance of 10 USD to play, press D if you want to deposit more");
            System.out.println("After deposit press Start - S key to play slot machine");
            System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            String depositChoice = input.next();
            if (depositChoice.equalsIgnoreCase("D")) {
                slotMachine.deposit(depositAmount(input) * CENTS_IN_USD);
            } else if (slotMachine.getBalance() >= MINIMUM_BALANCE_CENTS && depositChoice.equalsIgnoreCase("S")) {
                continueGame = false;
            }
        } while (continueGame);

        do {
            System.out.println("Press 1 to SPIN, 2 to CHANGE spin cost, 3 to CASHOUT, 4 to DEPOSIT");
            System.out.println("Spin Cost: " + ((double) slotMachine.getSpinCost() / CENTS_IN_USD) + " USD");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
            }
            int menuChoice = input.nextInt();
            if (menuChoice == 1 && slotMachine.getBalance() >= slotMachine.getSpinCost()) {
                slotMachine.slots();
                slotMachine.spinCostDeduct();
                long balanceBeforeWins = slotMachine.getBalance();
                continueGame = true;
                for (int r = 0; r < SLOT_ROWS; r++) {
                    for (int c = 0; c < SLOT_COLUMNS; c++) {
                        System.out.print(result[r][c]);
                        if (c < SLOT_COLUMNS - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                int count;

                for (int r = 0; r < SLOT_ROWS; r++) {
                    count = 1;
                    for (int c = 0; c < SLOT_COLUMNS - 1; c++) {
                        if (result[r][c].equals(result[r][c + 1])) {
                            count++;

                        } else {
                            break;
                        }
                    }
                    if (count == FIVE_EVEN_SYMBOLS_COUNT) {
                        slotMachine.winningMoney(FIVE_ROW_WIN, multiply);
                    } else if (count == FOUR_EVEN_SYMBOLS_COUNT) {
                        slotMachine.winningMoney(FOUR_ROW_WIN, multiply);
                    } else if (count == THREE_EVEN_SYMBOLS_COUNT) {
                        slotMachine.winningMoney(THREE_ROW_WIN, multiply);
                    } else if (count == TWO_EVEN_SYMBOLS_COUNT) {
                        slotMachine.winningMoney(TWO_ROW_WIN, multiply);
                    }
                }
                System.out.println("Won: " + (slotMachine.centsToUSD(slotMachine.getBalance() - balanceBeforeWins)) + " USD");
                System.out.println("Balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");

            } else if (menuChoice == 2) {
                System.out.println("Input spin cost");
                do {
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
                    }
                    multiply = input.nextInt();
                    if (multiply < 0) {
                        System.out.println("You can't input a negative number");
                    } else if (multiply == 0) {
                        System.out.println("You can't input zero");
                    } else if (multiply > slotMachine.getBalance() / CENTS_IN_USD) {
                        System.out.println("Spin cost cannot exceed your balance.");
                        System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
                    }
                } while (multiply <= 0 || multiply > slotMachine.getBalance() / CENTS_IN_USD);
                slotMachine.changeSpinCost(START_SPIN_COST, multiply);
                continueGame = true;
            } else if (menuChoice == 3) {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
                continueGame = false;
            } else if (menuChoice == 4) {
                slotMachine.deposit(depositAmount(input) * CENTS_IN_USD);
                continueGame = true;
            } else if (slotMachine.getSpinCost() > slotMachine.getBalance()) {
                System.out.println("Not enough funds");
            } else {
                System.out.println("Wrong input try again");
                continueGame = true;
            }
        } while (continueGame);
    }
}
