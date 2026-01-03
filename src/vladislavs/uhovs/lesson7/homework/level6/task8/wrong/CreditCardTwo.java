package vladislavs.uhovs.lesson7.homework.level6.task8.wrong;

import java.util.Scanner;

public class CreditCardTwo {

    private static final int PAN_LENGTH = 16;
    private static final String PAN_PATTERN = "[0-9]{" + PAN_LENGTH + "}";
    private static final int PIN_LENGTH = 3;
    private static final String PIN_PATTERN = "[0-9]{" + PIN_LENGTH + "}";
    int balance;
    final int creditLimit = 30000;
    int creditLeft;
    int debt = 0;
    String creditCardPin;
    String  creditCardNumber;

    Scanner scanner;

    public CreditCardTwo(Scanner scanner) {
        this.scanner = scanner;
    }


    public String createCreditCardNumber(Scanner scanner) {
        System.out.println("Please INPUT 16 length number you want your credit card to have");
        creditCardNumber = scanner.next();
        while (!creditCardNumber.matches(PAN_PATTERN)) {
            System.out.println("Wrong INPUT! Please input 16 length number!");
            creditCardNumber = scanner.next();
        }
        System.out.println("Your credit card number is: " + creditCardNumber);
        return creditCardNumber;
    }

    public String createCreditCardPin(Scanner scanner) {
        System.out.println("Please INPUT 3 length number you want your credit card PIN to have");
        creditCardPin = scanner.next();
        while (!creditCardPin.matches(PIN_PATTERN)) {
            System.out.println("Wrong INPUT! Please input 3 length number!");
            creditCardPin = scanner.next();
        }
        System.out.println("Your credit card PIN is: " + creditCardPin);
        return creditCardPin;
    }

    public void moneyFlow(){
        int deposit = deposit(scanner, scanner);
        if (debt > 0) {
            if (deposit >= debt){
                balance += (deposit - debt);
                debt = 0;
            }else {
                debt -= deposit;
            }
        }else {
            balance += deposit;
        }
        creditLeft = creditLimit - debt;
        System.out.println("Your balance now is: " + balance + " Euro");
        System.out.println("Your debt now is: " + debt + " Euro");
        System.out.println("Your credit now is: " + creditLeft + " Euro");
        withdraw(scanner, scanner);
        if (balance < 0){
            debt += (-balance);
            balance = 0;
        }
        creditLeft = creditLimit - debt;
        System.out.println("Your balance now is: " + balance + " Euro");
        System.out.println("Your debt now is: " + debt + " Euro");
        System.out.println("Your credit now is: " + creditLeft + " Euro");
    }

    public int deposit(Scanner inputPIN, Scanner inputDeposit) {
        System.out.println("Please input your PIN to DEPOSIT");
        String checkPin = inputPIN.next();
        while (!(creditCardPin.equals(checkPin))) {
            System.out.println("Wrong PIN");
            checkPin = inputPIN.next();
        }
        System.out.println("Please deposit EUR");
        int depositAmount = inputDeposit.nextInt();
        while (depositAmount < 0){
            System.out.println("Error: can't deposit negative funds! Try to deposit again");
            depositAmount = inputDeposit.nextInt();

        }
        return depositAmount;
    }

    public int withdraw(Scanner inputPIN, Scanner inputWithdraw){
        System.out.println("Please input your PIN to WITHDRAW");
        String checkPin = inputPIN.next();
        while (!(creditCardPin.equals(checkPin))) {
            System.out.println("Wrong PIN");
            checkPin = inputPIN.next();
        }
        System.out.println("Please withdraw EUR");
        int withdrawAmount = inputWithdraw.nextInt();
        while (creditLeft < withdrawAmount){
            System.out.println("Credit limit left: " + creditLeft + " Euro. You can't withdraw more");
            System.out.println("Please withdraw EUR");
            withdrawAmount = inputWithdraw.nextInt();
        }
        while (withdrawAmount < 0){
            System.out.println("Error: can't withdraw negative funds! Try to withdraw again");
            withdrawAmount = inputWithdraw.nextInt();
        }
        balance = this.balance - withdrawAmount;
        return withdrawAmount;
    }
}
