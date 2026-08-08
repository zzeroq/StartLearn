package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachineSimulationProfit {

    private static final int TWO_ROW_WIN = 40;
    private static final int THREE_ROW_WIN = 100;
    private static final int FOUR_ROW_WIN = 1000;
    private static final int FIVE_ROW_WIN = 1860;
    private static final int WHOLE_PERCENTAGE = 100;
    private static final int SLOT_ROWS = 5;
    private static final int SLOT_COLUMNS = 5;


    public static void main(String[] args) {

        long spinCost = 100;
        int count;
        int count2 = 0;
        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[][] result = new String[5][5];
        Random random = new Random();
        long startingBalance = 100000000;
        long balance = 100000000;
        long simulationTries = 10000000;
        int win2 = 0;
        int win3 = 0;
        int win4 = 0;
        int win5 = 0;
        int multiply = 1;
        SlotMachine slotMachine = new SlotMachine(balance, spinCost, fruit, result, random,multiply);

        do {
            count2++;
            slotMachine.slots();
            balance -= spinCost;

            for (int r = 0; r < SLOT_ROWS; r++) {
                count = 1;
                for (int c = 0; c < SLOT_COLUMNS - 1; c++) {
                    if (result[r][c].equals(result[r][c + 1])) {
                        count++;

                    } else {
                        break;
                    }
                }
                if (count == 5) {
                    slotMachine.winningMoney(FIVE_ROW_WIN);
                    win5++;
                } else if (count == 4) {
                    slotMachine.winningMoney(FOUR_ROW_WIN);
                    win4++;
                } else if (count == 3) {
                    slotMachine.winningMoney(THREE_ROW_WIN);
                    win3++;
                } else if (count == 2) {
                    slotMachine.winningMoney(TWO_ROW_WIN);
                    win2++;
                }
            }

        } while (count2 < simulationTries);
        long totalBet = simulationTries * spinCost;
        long totalPayout = balance - startingBalance + totalBet;
        balance = startingBalance - totalBet + totalPayout;

        double RTP = ((double) totalPayout / totalBet) * 100;
        double houseEdge = ((double) WHOLE_PERCENTAGE - RTP);
        System.out.println("Balance after simulation ty's: " + balance);
        System.out.println("Casino PROFIT: " + (startingBalance - balance));
        System.out.printf("House edge: %.2f%%%n", houseEdge);
        System.out.printf("RTP: %.2f%%%n", RTP);
        System.out.println("Win 2: " + win2);
        System.out.println("Win 3: " + win3);
        System.out.println("Win 4: " + win4);
        System.out.println("Win 5: " + win5);
    }
}
