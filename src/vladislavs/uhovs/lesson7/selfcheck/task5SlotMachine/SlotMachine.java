package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {


    public void slots(String[] fruit, String[][] result, Random random, int row, int column) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                result[r][c] = fruit[random.nextInt(result.length)];
            }
        }
    }

    public long spinCostSubstraction(long balance, long spinCost) {
        return balance - spinCost;
    }

    public long deposit(long balance, long deposit) {
        return balance + deposit;
    }

    public long winningMoney(long balance, long lineWin, int multiply) {
        return lineWin * multiply + balance;
    }


}
