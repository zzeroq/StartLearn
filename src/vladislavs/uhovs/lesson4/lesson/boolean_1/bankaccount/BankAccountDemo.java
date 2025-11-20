package vladislavs.uhovs.lesson4.lesson.boolean_1.bankaccount;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.printState();
        bankAccount.deposit(100);
        bankAccount.printState();
        System.out.println();

        bankAccount.deposit(200);
        bankAccount.printState();
        System.out.println();

        bankAccount.withdraw(400);
        bankAccount.printState();
        System.out.println();

        bankAccount.deposit(-400);
        bankAccount.printState();
        System.out.println();

        bankAccount.withdraw(-100);
        bankAccount.printState();
        System.out.println();



    }



}
