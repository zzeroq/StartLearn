package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {

    private static final int TWO_MATCHING_SYMBOLS = 2;
    private static final int THREE_MATCHING_SYMBOLS = 3;
    private static final int FOUR_MATCHING_SYMBOLS = 4;
    private static final int FIVE_MATCHING_SYMBOLS = 5;
    private static final int TWO_MATCH_WIN = 40;
    private static final int THREE_MATCH_WIN = 100;
    private static final int FOUR_MATCH_WIN = 1000;
    private static final int FIVE_MATCH_WIN = 1860;
    static final int SLOT_ROWS = 5;
    static final int SLOT_COLUMNS = 5;
    static final int MINIMUM_BALANCE_CENTS = 1000;
    static final int CENTS_IN_USD = 100;
    static final long STARTING_SPIN_COST = 100;
    static final long PLAYER_STARTING_BALANCE = 0;
    static final int STARTING_MULTIPLY = 1;
    static final int STARTING_ID = 1000;
    private long spinCost;
    private final String[] fruit;
    private final String[][] result;
    private final Random random;
    private int betMultiply;


    public SlotMachine(long spinCost, String[] fruit, String[][] result, Random random, int betMultiply) {
        this.spinCost = spinCost;
        this.fruit = fruit;
        this.result = result;
        this.random = random;
        this.betMultiply = betMultiply;
    }

    public void spin(Player player) {
        slots();
        checkWin(player);
    }


    public long getSpinCost() {
        return spinCost;
    }

    public String[][] getResult() {
        return result;
    }


    public void changeSpinCost(long startSpinCost, int betMultiply) {
        this.betMultiply = betMultiply;
        spinCost = startSpinCost * betMultiply;
    }

    public void slots() {
        for (int r = 0; r < result.length; r++) {
            for (int c = 0; c < result[r].length; c++) {
                result[r][c] = fruit[random.nextInt(fruit.length)];
            }
        }
    }

    public void applyWin(int count, Player player) {
        if (count >= TWO_MATCHING_SYMBOLS) {
            long win = switch (count) {
                case TWO_MATCHING_SYMBOLS -> TWO_MATCH_WIN;
                case THREE_MATCHING_SYMBOLS -> THREE_MATCH_WIN;
                case FOUR_MATCHING_SYMBOLS -> FOUR_MATCH_WIN;
                case FIVE_MATCHING_SYMBOLS -> FIVE_MATCH_WIN;
                default -> 0;
            };
            player.winningMoney(win,betMultiply);
        }
    }

    public void checkWin(Player player) {
        for (int r = 0; r < SLOT_ROWS; r++) {
            int count = 1;
            for (int c = 0; c < SLOT_COLUMNS - 1; c++) {
                if (result[r][c].equals(result[r][c + 1])) {
                    count++;

                } else {
                    break;
                }
            }
            applyWin(count, player);
        }
    }

    public double centsToUSD(long cents) {
        return (double) cents / CENTS_IN_USD;
    }



}
