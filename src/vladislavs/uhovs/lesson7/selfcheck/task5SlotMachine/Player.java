package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Scanner;

public class Player {

    private final long id;
    private final String fullName;
    private final String nickName;
    private final String password;
    private long playerBalance;

    public Player(long id, String fullName, String nickName, String password, long playerBalance) {
        this.id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.password = password;
        this.playerBalance = playerBalance;
    }

    String getFullName() {
        return fullName;
    }

    long getPlayerBalance() {
        return playerBalance;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }


    public void spinCostDeduct(long spinCost) {
        playerBalance -= spinCost;
    }

    public void winningMoney(long lineWin, int betMultiply) {
        playerBalance += lineWin * betMultiply;
    }

    public void deposit(long amount) {
        playerBalance += amount;
    }

}
