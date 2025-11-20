package vladislavs.uhovs.lesson4.lesson.boolean_1.bankaccount;

public class BankAccount {

    int balance;




    void  deposit(int amount){

        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        }else System.out.println("Error: can't deposit negative funds");

    }


    void withdraw(int amount){

        if (amount >= 0){
            if (amount <= balance){
                balance -= amount;
                System.out.println("Withdrew" + amount);
            } else {
                System.out.println("Error: insufficient funds");
            }
        }else System.out.println("Error: can't withdraw negative funds");
    }
    void printState(){
        System.out.println("Current balance: " + balance);
    }

}
