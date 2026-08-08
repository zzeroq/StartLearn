package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Scanner;

public class GameMenu {

    private final SlotMachine slotMachine;
    private final Scanner input;

    public GameMenu(SlotMachine slotMachine, Scanner input) {
        this.slotMachine = slotMachine;
        this.input = input;
    }

    public void validateCorrectInput() {
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
        }
    }

    public long depositAmount() {
        long value;
        System.out.println("Deposit amount");
        do {
            validateCorrectInput();
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
        boolean continueGame = true;
        String depositChoice;
        do {
            System.out.println("You need a minimum balance of 10 USD to play, press D if you want to deposit more");
            System.out.println("After deposit press Start - S key to play slot machine");
            System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            depositChoice = input.next();
            if (depositChoice.equalsIgnoreCase("D")) {
                slotMachine.deposit(depositAmount() * SlotMachine.CENTS_IN_USD);
            } else if (slotMachine.getBalance() >= SlotMachine.MINIMUM_BALANCE_CENTS && depositChoice.equalsIgnoreCase("S")) {
                continueGame = false;
            }
        } while (continueGame);
    }

    public void slotDisplay() {
        String[][] result = slotMachine.getResult();
        for (int r = 0; r < SlotMachine.SLOT_ROWS; r++) {
            for (int c = 0; c < SlotMachine.SLOT_COLUMNS; c++) {
                System.out.print(result[r][c]);
                if (c < SlotMachine.SLOT_COLUMNS - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void gameMenuChooseOne() {
        long balanceBeforeWin = slotMachine.getBalance() - slotMachine.getSpinCost();
        slotMachine.spin();
        slotDisplay();
        System.out.println("Won: " + (slotMachine.centsToUSD(slotMachine.getBalance() - balanceBeforeWin)) + " USD");
        System.out.println("Balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
    }

    public void gameMenuChooseTwo() {
        System.out.println("Input spin cost");
        int multiply;
        do {
            validateCorrectInput();
            multiply = input.nextInt();
            if (multiply < 0) {
                System.out.println("You can't input a negative number");
            } else if (multiply == 0) {
                System.out.println("You can't input zero");
            } else if (multiply > slotMachine.getBalance() / SlotMachine.CENTS_IN_USD) {
                System.out.println("Spin cost cannot exceed your balance.");
                System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            }
        } while (multiply <= 0 || multiply > slotMachine.getBalance() / SlotMachine.CENTS_IN_USD);
        slotMachine.changeSpinCost(SlotMachine.STARTING_SPIN_COST, multiply);
    }

}
