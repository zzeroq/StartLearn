package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineDemo {

    public static void main(String[] args) {

        String[] fruit = {"🍎", "🍌", "🍒", "💵", "💎"};
        String[][] result = new String[SlotMachine.SLOT_ROWS][SlotMachine.SLOT_COLUMNS];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Player player = new Player(1001, "name", "nickName", "pass", 0);
        SlotMachine slotMachine = new SlotMachine(SlotMachine.STARTING_SPIN_COST, fruit, result, random, SlotMachine.STARTING_MULTIPLY);
        PlayerManagement playerManagement = new PlayerManagement();
        GameMenu gameMenu = new GameMenu(slotMachine, input, player,playerManagement);

        gameMenu.play();
        input.close();
    }
}
