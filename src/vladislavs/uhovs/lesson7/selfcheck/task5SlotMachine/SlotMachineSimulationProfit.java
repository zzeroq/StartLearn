package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachineSimulationProfit {
    public static void main(String[] args) {

        int spinCost = 1;
        int count = 1;
        int count2 = 0;
        String[] fruit = {"🍒", "🍎", "🥭", "🍍", "🍌"};
        String[] result = new String[5];
        Random random = new Random();
        SlotMachine slotMachine = new SlotMachine();
        int startingBalance = 10000000;
        int balance = 10000000;
        int simulationTries = 100000000;
        int win2 = 0;
        int win3 = 0;
        int win4 = 0;
        int win5 = 0;


        do {
            count = 1;
            count2++;
            slotMachine.slots(fruit, result, random);
            balance = slotMachine.spinCost(balance, spinCost);

            for (int i = 0; i < result.length - 1; i++) {
                if (result[i].equals(result[i + 1])) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == 5) {
                balance = slotMachine.winningMoney(balance, spinCost, 93);
                win5++;
            } else if (count == 4) {
                balance = slotMachine.winningMoney(balance, spinCost, 50);
                win4++;
            } else if (count == 3) {
                balance = slotMachine.winningMoney(balance, spinCost, 5);
                win3++;
            } else if (count == 2) {
                balance = slotMachine.winningMoney(balance, spinCost, 2);
                win2++;
            }

        } while (count2 < simulationTries);
        double RTP = ((double) balance / simulationTries) * 100;
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
