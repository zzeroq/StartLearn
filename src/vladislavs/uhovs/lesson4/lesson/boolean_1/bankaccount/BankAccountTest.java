package vladislavs.uhovs.lesson4.lesson.boolean_1.bankaccount;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccountTest testRunner = new BankAccountTest();
        testRunner.shouldDeposit();


    }

    void shouldDeposit (){
        BankAccount subject = new BankAccount();

        subject.deposit(100);
        int expected = 100;
        int actual = subject.balance;

        assertThatEqual(expected,actual,"Deposit positive amount");
    }
    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[OK]:" + scenario + " passed!");
        } else {
            System.out.println("[FAIL]:" + scenario + "failed!");
        }
    }


}
