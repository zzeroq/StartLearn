package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {

    private long balance;
    private long spinCost;
    private final String[] fruit;
    private final String[][] result;
    private final Random random;


    public SlotMachine(long balance, long spinCost, String[] fruit, String[][] result, Random random) {
        this.balance = balance;
        this.spinCost = spinCost;
        this.fruit = fruit;
        this.result = result;
        this.random = random;
    }

    public long getSpinCost() {
        return spinCost;
    }

    public String[][] getResult() {
        return result;
    }

    public long getBalance() {
        return balance;
    }

    public void changeSpinCost (long startSpinCost, int multiply) {
        spinCost = startSpinCost * multiply;
    }

    public void slots() {
        for (int r = 0; r < result.length; r++) {
            for (int c = 0; c < result[r].length; c++) {
                result[r][c] = fruit[random.nextInt(fruit.length)];
            }
        }
    }

    public void spinCostDeduct() {
        balance -= spinCost;
    }

    public void winningMoney(long lineWin, int multiply) {
        balance += lineWin * multiply;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public double centsToUSD(long cents) {
        return (double) cents / 100;
    }

}
