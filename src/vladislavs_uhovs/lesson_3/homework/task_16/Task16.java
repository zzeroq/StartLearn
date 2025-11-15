package vladislavs_uhovs.lesson_3.homework.task_16;

class Task16 {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    Task16(String ownerFirstName,
           String ownerLastName,
           int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName(){
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }

}
