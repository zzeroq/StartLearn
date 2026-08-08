package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};
        String[][] result = new String[SlotMachine.SLOT_ROWS][SlotMachine.SLOT_COLUMNS];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean continueGame = true;
        SlotMachine slotMachine = new SlotMachine(SlotMachine.STARTING_BALANCE, SlotMachine.STARTING_SPIN_COST, fruit, result, random, SlotMachine.STARTING_MULTIPLY);
        GameMenu gameMenu = new GameMenu(slotMachine, input);

        gameMenu.depositMenu();

        do {
            System.out.println("Press 1 to SPIN, 2 to CHANGE spin cost, 3 to CASHOUT, 4 to DEPOSIT");
            System.out.println("Spin Cost: " + slotMachine.centsToUSD(slotMachine.getSpinCost()) + " USD");
            gameMenu.validateCorrectInput();
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
                slotMachine.deposit(gameMenu.depositAmount() * SlotMachine.CENTS_IN_USD);
                System.out.println("Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            } else if (slotMachine.getSpinCost() > slotMachine.getBalance()) {
                System.out.println("Not enough funds. Your balance: " + slotMachine.centsToUSD(slotMachine.getBalance()) + " USD");
            } else {
                System.out.println("Wrong input try again");
            }
        } while (continueGame);
        input.close();
    }
}
