package vladislavs.uhovs.lesson7.selfcheck.whileTask;

public class WhileDoWhileLogic {

    public boolean isEnoughBalance(int balance, int withdraw){
        return balance >= withdraw;
    }
    public int withdrawAmount(int balance, int withdraw){
        return balance - withdraw;
    }
    public boolean isWithdrawNegative(int withdraw){
        return withdraw <= 0;
    }

}
