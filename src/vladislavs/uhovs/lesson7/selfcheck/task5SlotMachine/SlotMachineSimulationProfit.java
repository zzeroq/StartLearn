package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachineSimulationProfit {

    private static final int WHOLE_PERCENTAGE = 100;
    private static final int TWO_MATCHING_SYMBOLS = 2;
    private static final int THREE_MATCHING_SYMBOLS = 3;
    private static final int FOUR_MATCHING_SYMBOLS = 4;
    private static final int FIVE_MATCHING_SYMBOLS = 5;

    public static void main(String[] args) {


        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[][] result = new String[SlotMachine.SLOT_ROWS][SlotMachine.SLOT_COLUMNS];
        Random random = new Random();
        long startingBalance;
        long balance = 100000000;
        startingBalance = balance;
        long simulationTries = 10000000;
        int twoMatchWin = 0;
        int threeMatchWin = 0;
        int fourMatchWin = 0;
        int fiveMatchWin = 0;

        SlotMachine slotMachine = new SlotMachine(balance, SlotMachine.STARTING_SPIN_COST, fruit, result, random, SlotMachine.STARTING_MULTIPLY);
        int count2 = 0;
        do {
            count2++;
            slotMachine.spin();
            balance = slotMachine.getBalance();
            for (int r = 0; r < SlotMachine.SLOT_ROWS; r++) {
                int count = 1;
                for (int c = 0; c < SlotMachine.SLOT_COLUMNS - 1; c++) {
                    if (result[r][c].equals(result[r][c + 1])) {
                        count++;
                    } else {
                        break;
                    }
                }
                switch (count) {
                    case TWO_MATCHING_SYMBOLS -> twoMatchWin++;
                    case THREE_MATCHING_SYMBOLS -> threeMatchWin++;
                    case FOUR_MATCHING_SYMBOLS -> fourMatchWin++;
                    case FIVE_MATCHING_SYMBOLS -> fiveMatchWin++;
                }
            }
        } while (count2 < simulationTries);
        long totalBet = simulationTries * SlotMachine.STARTING_SPIN_COST;
        long totalPayout = balance - startingBalance + totalBet;
        balance = startingBalance - totalBet + totalPayout;

        double RTP = ((double) totalPayout / totalBet) * 100;
        double houseEdge = ((double) WHOLE_PERCENTAGE - RTP);
        System.out.println("Balance after simulation ty's: " + balance);
        System.out.println("Casino PROFIT: " + (startingBalance - balance));
        System.out.printf("House edge: %.2f%%%n", houseEdge);
        System.out.printf("RTP: %.2f%%%n", RTP);
        System.out.println("Win 2: " + twoMatchWin + " tries");
        System.out.println("Win 3: " + threeMatchWin + " tries");
        System.out.println("Win 4: " + fourMatchWin + " tries");
        System.out.println("Win 5: " + fiveMatchWin + " tries");
        System.out.println(twoMatchWin + threeMatchWin + fourMatchWin + fiveMatchWin + " all winning combinations");
    }
}
