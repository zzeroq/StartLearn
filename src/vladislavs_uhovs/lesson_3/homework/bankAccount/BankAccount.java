package vladislavs_uhovs.lesson_3.homework.bankAccount;

public class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
        // return "" + this.money; Or this method
    }

}
