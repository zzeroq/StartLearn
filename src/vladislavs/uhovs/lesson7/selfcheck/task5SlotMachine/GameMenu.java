package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Scanner;

public class GameMenu {


    private static final int MINIMUM_BALANCE_CENTS = 1000;
    private static final int SLOT_ROWS = 5;
    private static final int SLOT_COLUMNS = 5;
    private static final int CENTS_IN_USD = 100;
    private static final int TWO_ROW_WIN = 40;
    private static final int THREE_ROW_WIN = 100;
    private static final int FOUR_ROW_WIN = 1000;
    private static final int FIVE_ROW_WIN = 1860;
    private static final long STARTING_SPIN_COST = 100;
    private static final int TWO_EVEN_SYMBOLS_COUNT = 2;
    private static final int THREE_EVEN_SYMBOLS_COUNT = 3;
    private static final int FOUR_EVEN_SYMBOLS_COUNT = 4;
    private static final int FIVE_EVEN_SYMBOLS_COUNT = 5;


    Scanner input = new Scanner(System.in);
    boolean continueGame = true;
    private final SlotMachine slotMachine;

    public GameMenu(SlotMachine slotMachine) {
        this.slotMachine = slotMachine;
    }

    public static long depositAmount(Scanner input) {
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

    public void depositMenu() {
        String depositChoice;
        do {
            System.out.println("You need a minimum balance of 10 USD to play, press D if you want to deposit more");
            System.out.println("After deposit press Start - S key to play slot machine");
            System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            depositChoice = input.next();
            if (depositChoice.equalsIgnoreCase("D")) {
                slotMachine.deposit(depositAmount(input) * CENTS_IN_USD);
            } else if (slotMachine.getBalance() >= MINIMUM_BALANCE_CENTS && depositChoice.equalsIgnoreCase("S")) {
                continueGame = false;
            }
        } while (continueGame);
    }

    public void gameMenuChooseOne() {
        String[][] result = slotMachine.getResult();
        slotMachine.slots();
        slotMachine.spinCostDeduct();
        long balanceBeforeWins = slotMachine.getBalance();
        for (int r = 0; r < SLOT_ROWS; r++) {
            for (int c = 0; c < SLOT_COLUMNS; c++) {
                System.out.print(result[r][c]);
                if (c < SLOT_COLUMNS - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
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
            slotMachine.applyWin(count, slotMachine.getMultiply());
        }
        System.out.println("Won: " + (slotMachine.centsToUSD(slotMachine.getBalance() - balanceBeforeWins)) + " USD");
        System.out.println("Balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
    }

    public void gameMenuChooseTwo() {
        System.out.println("Input spin cost");
        int multiply;
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
        slotMachine.changeSpinCost(STARTING_SPIN_COST, multiply);
    }

}
