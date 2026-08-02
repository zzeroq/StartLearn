package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;
import java.util.Scanner;

import static vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine.GameMenu.depositAmount;

public class SlotMachineDemo {

    private static final int SLOT_ROWS = 5;
    private static final int SLOT_COLUMNS = 5;
    private static final int CENTS_IN_USD = 100;
    private static final long STARTING_SPIN_COST = 100;
    private static final int STARTING_BALANCE = 0;
    private static final int STARTING_MULTIPLY = 1;


    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};
        String[][] result = new String[SLOT_ROWS][SLOT_COLUMNS];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean continueGame = true;
        SlotMachine slotMachine = new SlotMachine(STARTING_BALANCE, STARTING_SPIN_COST, fruit, result, random, STARTING_MULTIPLY);
        GameMenu gameMenu = new GameMenu(slotMachine);


        gameMenu.depositMenu();

        do {
            System.out.println("Press 1 to SPIN, 2 to CHANGE spin cost, 3 to CASHOUT, 4 to DEPOSIT");
            System.out.println("Spin Cost: " + ((double) slotMachine.getSpinCost() / CENTS_IN_USD) + " USD");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
            }
            int menuChoice = input.nextInt();
            if (menuChoice == 1 && slotMachine.getBalance() >= slotMachine.getSpinCost()) {
                gameMenu.gameMenuChooseOne();
            } else if (menuChoice == 2) {
              gameMenu.gameMenuChooseTwo();
            } else if (menuChoice == 3) {
                System.out.println("Thank you for playing");
                System.out.println("You won: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
                continueGame = false;
            } else if (menuChoice == 4) {
                slotMachine.deposit(depositAmount(input) * CENTS_IN_USD);
            } else if (slotMachine.getSpinCost() > slotMachine.getBalance()) {
                System.out.println("Not enough funds. Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            } else {
                System.out.println("Wrong input try again");
            }
        } while (continueGame);
    }
}
