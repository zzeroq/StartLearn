package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {

    private long balance;
    private long spinCost;

    public SlotMachine(long balance, long spinCost) {
        this.balance = balance;
        this.spinCost = spinCost;
    }

    public long getSpinCost() {
        return spinCost;
    }

    public long getBalance() {
        return balance;
    }

    public void changeSpinCost (long startSpinCost, int multiply) {
        spinCost = startSpinCost * multiply;
    }

    public void slots(String[] fruit, String[][] result, Random random, int row, int column) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
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
