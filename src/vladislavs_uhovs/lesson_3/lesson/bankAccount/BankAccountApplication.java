package vladislavs_uhovs.lesson_3.lesson.bankAccount;

public class BankAccountApplication {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Gen Gi",199);
        BankAccount bankAccount2 = new BankAccount("Philip Frie", 2400);
        BankAccount bankAccount3 = new BankAccount("Ksen Group", 7640);


        System.out.println("Owner 1 = " +bankAccount1.ownerName);
        System.out.println("Amount 1 = " +bankAccount1.amountEuro);

        System.out.println("Owner 2 = " +bankAccount2.ownerName);
        System.out.println("Amount 2 = " +bankAccount2.amountEuro);

        System.out.println("Owner 3 = " +bankAccount3.ownerName);
        System.out.println("Amount 3 = " +bankAccount3.amountEuro);




    }


}
