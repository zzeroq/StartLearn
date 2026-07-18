package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachineSimulationProfit {
    public static void main(String[] args) {

        long spinCost = 100;
        int count;
        int count2 = 0;
        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[][] result = new String[5][5];
        Random random = new Random();
        SlotMachine slotMachine = new SlotMachine();
        long startingBalance = 100000000;
        long balance = 100000000;
        long simulationTries = 100000000;
        int win2 = 0;
        int win3 = 0;
        int win4 = 0;
        int win5 = 0;
        int multiply = 1;


        do {
            count2++;
            slotMachine.slots(fruit, result, random, 5, 5);
            balance = slotMachine.spinCostSubstraction(balance, spinCost);

            for (int r = 0; r < 5; r++) {
                count = 1;
                for (int c = 0; c < 5 - 1; c++) {
                    if (result[r][c].equals(result[r][c + 1])) {
                        count++;

                    } else {
                        break;
                    }
                }
                if (count == 5) {
                    balance = slotMachine.winningMoney(balance, 1860, multiply);
                    win5++;
                } else if (count == 4) {
                    balance = slotMachine.winningMoney(balance, 1000, multiply);
                    win4++;
                } else if (count == 3) {
                    balance = slotMachine.winningMoney(balance, 100, multiply);
                    win3++;
                } else if (count == 2) {
                    balance = slotMachine.winningMoney(balance,40,multiply);
                    win2++;
                }
            }

        } while (count2 < simulationTries);
        long totalBet = simulationTries * spinCost;
        long totalPayout = balance - startingBalance + totalBet;
        balance = startingBalance - totalBet + totalPayout;

        double RTP = ((double) totalPayout / totalBet) * 100;
        double houseEdge = ((double) 100 - RTP);
        System.out.println("Balance after 100 mil try's: " + balance);
        System.out.println("Casino PROFIT: " + (startingBalance - balance));
        System.out.printf("House edge: %.2f%%%n", houseEdge);
        System.out.printf("RTP: %.2f%%%n", RTP);
        System.out.println("Win 2: " + win2);
        System.out.println("Win 3: " + win3);
        System.out.println("Win 4: " + win4);
        System.out.println("Win 5: " + win5);
    }
}
