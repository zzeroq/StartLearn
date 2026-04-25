package vladislavs.uhovs.lesson7.selfcheck.whileTask;

import java.util.Scanner;

public class WhileDoWhileDemo {

    private static int positiveNumber(Scanner scanner){
        WhileDoWhileLogic whileDoWhileLogic = new WhileDoWhileLogic();
        int transaction = scanner.nextInt();
        while (whileDoWhileLogic.isInputNotPositive(transaction)) {
            System.out.println();
            System.out.println("Wrong input, cant' be negative or zero. input again");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Wrong input! Only numbers allowed, input again");
            }
            transaction = scanner.nextInt();
        }
        return transaction;
    }



    private static int depositWithdrawTransaction(int balance, Scanner scanner, String depositOrWithdraw ) {
        WhileDoWhileLogic whileDoWhileLogic = new WhileDoWhileLogic();
        do {
            System.out.println();
            System.out.println("Your balance now: " + balance);
            System.out.println("Do you want to proceed? Y/N");
            String transactionApprove = scanner.next();
            if ("Y".equalsIgnoreCase(transactionApprove)) {
                System.out.println("Input amount");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("Wrong input! Only numbers allowed, input again");
                }
                int transaction = WhileDoWhileDemo.positiveNumber(scanner);
                if (depositOrWithdraw.equalsIgnoreCase("D")){
                    balance = whileDoWhileLogic.depositAmount(balance, transaction);
                }else if (depositOrWithdraw.equalsIgnoreCase("W")) {
                    if (whileDoWhileLogic.isEnoughBalance(balance,transaction)){
                    balance = whileDoWhileLogic.withdrawAmount(balance, transaction);
                    }else {
                        System.out.println("Sorry you don't have enough funds to withdraw");
                    }
                }
            } else if ("N".equalsIgnoreCase(transactionApprove)) {
                break;
            } else {
                System.out.println("Wrong input. Try only Y or N");
            }
        } while (true);
        return balance;
    }

    public static void main(String[] args) {

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println("loading " + number + " of 10");
        }
        System.out.println("Completed");
        System.out.println();

        int startingBalance = 1000;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input D - to deposit or W - to withdraw to proceed");
            System.out.println("Input E - to end");
            String chooseTransaction = input.next();
            if ("d".equalsIgnoreCase(chooseTransaction)) {
                startingBalance = WhileDoWhileDemo.depositWithdrawTransaction(startingBalance, input, chooseTransaction);
            } else if ("w".equalsIgnoreCase(chooseTransaction)) {
                startingBalance = WhileDoWhileDemo.depositWithdrawTransaction(startingBalance, input, chooseTransaction);
            }else if ("e".equalsIgnoreCase(chooseTransaction)){
                break;
            }else {
                System.out.println("Wrong input! Input only D, W or E");
            }
        } while (true);
    }
}
