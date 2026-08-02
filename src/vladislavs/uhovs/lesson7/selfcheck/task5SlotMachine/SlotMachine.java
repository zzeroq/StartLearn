package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {

    private long balance;
    private long spinCost;
    private final String[] fruit;
    private final String[][] result;
    private final Random random;
    private int multiply;
    private static final int TWO_EVEN_SYMBOLS_COUNT = 2;
    private static final int THREE_EVEN_SYMBOLS_COUNT = 3;
    private static final int FOUR_EVEN_SYMBOLS_COUNT = 4;
    private static final int FIVE_EVEN_SYMBOLS_COUNT = 5;
    private static final int TWO_ROW_WIN = 40;
    private static final int THREE_ROW_WIN = 100;
    private static final int FOUR_ROW_WIN = 1000;
    private static final int FIVE_ROW_WIN = 1860;


    public SlotMachine(long balance, long spinCost, String[] fruit, String[][] result, Random random, int multiply) {
        this.balance = balance;
        this.spinCost = spinCost;
        this.fruit = fruit;
        this.result = result;
        this.random = random;
        this.multiply = multiply;
    }

    public void applyWin(int count, int multiply) {
        if (count == FIVE_EVEN_SYMBOLS_COUNT) {
            winningMoney(FIVE_ROW_WIN, multiply);
        } else if (count == FOUR_EVEN_SYMBOLS_COUNT) {
            winningMoney(FOUR_ROW_WIN, multiply);
        } else if (count == THREE_EVEN_SYMBOLS_COUNT) {
            winningMoney(THREE_ROW_WIN, multiply);
        } else if (count == TWO_EVEN_SYMBOLS_COUNT) {
            winningMoney(TWO_ROW_WIN, multiply);
        }
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
        this.multiply = multiply;
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

    public int getMultiply() {
        return multiply;
    }

}
