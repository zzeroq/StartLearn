package vladislavs.uhovs.lesson7.selfcheck.whileTask;

import java.util.Scanner;

public class WhileDoWhileDemo {

    public static void main(String[] args) {

        int number = 0;
        while (number < 10){
            number++;
            System.out.println(number);
        }

        int balance = 1000;
        Scanner input = new Scanner(System.in);
        WhileDoWhileLogic whileDoWhileLogic = new WhileDoWhileLogic();

        do {
            System.out.println();
            System.out.println("Your balance now: " + balance);
            System.out.println("Do you want to withdraw? Y/N");
            String withdrawApprove = input.next();
            if ("Y".equalsIgnoreCase(withdrawApprove)) {
                System.out.println("Input amount to withdraw");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("Wrong input! Only numbers allowed, input again");
                }
                int withdraw = input.nextInt();
                while (whileDoWhileLogic.isWithdrawNegative(withdraw)) {
                    System.out.println();
                    System.out.println("Wrong input, cant' be negative. input again");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("Wrong input! Only numbers allowed, input again");
                    }
                    withdraw = input.nextInt();
                }
                if (whileDoWhileLogic.isEnoughBalance(balance, withdraw)) {
                    balance = whileDoWhileLogic.withdrawAmount(balance, withdraw);
                } else {
                    System.out.println("Sorry you don't have enough funds to withdraw");
                }


            }else if ("N".equalsIgnoreCase(withdrawApprove)){
                break;
            }else {
                System.out.println("Wrong input. Try only Y or N");
            }
        }while (true);
    }
}
