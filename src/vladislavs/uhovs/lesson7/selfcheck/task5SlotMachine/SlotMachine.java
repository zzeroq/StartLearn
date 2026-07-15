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

    public int spinCost(int balance, int spinCost) {
        return balance - spinCost;
    }

    public int deposit(int balance, int deposit) {
        return balance + deposit;
    }

    public int winningMoney(int balance, int spinCost, int multiply) {
        return spinCost * multiply + balance;
    }


}
