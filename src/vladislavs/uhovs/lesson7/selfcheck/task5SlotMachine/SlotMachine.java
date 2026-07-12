package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Random;

public class SlotMachine {


    public void slots(String[] fruit, String[] result, Random random){
        for (int i = 0; i < result.length; i++) {
            result[i] = fruit[random.nextInt(result.length)];
        }
    }

    public int spinCost(int balance, int spinCost){
        return balance - spinCost;
    }

    public int deposit(int balance, int deposit){
        return balance + deposit;
    }

    public int winingMoney(int balance, int spinCost, int multiply){
        return spinCost * multiply + balance;
    }





}
