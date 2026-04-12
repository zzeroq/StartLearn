package vladislavs.uhovs.lesson7.selfcheck.whileTask;

public class WhileDoWhileLogic {

    public boolean isEnoughBalance(int balance, int withdraw){
        return balance >= withdraw;
    }
    public int withdrawAmount(int balance, int withdraw){
        return balance - withdraw;
    }
    public boolean isInputNotPositive(int input){
        return input <= 0;
    }
    public int depositAmount(int balance, int deposit){
        return balance + deposit;
    }

}
