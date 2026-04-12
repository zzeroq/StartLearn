package vladislavs.uhovs.lesson7.selfcheck.whileTask;

import java.util.Scanner;

public class WhileDoWhileDemo {

    public static void main(String[] args) {

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number);
        }


        int balance = 1000;
        Scanner input = new Scanner(System.in);
        WhileDoWhileLogic whileDoWhileLogic = new WhileDoWhileLogic();
        do {
            System.out.println("Input D - to deposit or W - to withdraw to proceed");
            System.out.println("Input E - to end");
            String chooseTransaction = input.next();
            if ("d".equalsIgnoreCase(chooseTransaction)) {
                do {
                    System.out.println();
                    System.out.println("Your balance now: " + balance);
                    System.out.println("Do you want to deposit? Y/N");
                    String depositApprove = input.next();
                    if ("Y".equalsIgnoreCase(depositApprove)) {
                        System.out.println("Input amount to deposit");
                        while (!input.hasNextInt()) {
                            input.next();
                            System.out.println("Wrong input! Only numbers allowed, input again");
                        }
                        int deposit = input.nextInt();
                        while (whileDoWhileLogic.isInputNotPositive(deposit)) {
                            System.out.println();
                            System.out.println("Wrong input, cant' be negative or zero. input again");
                            while (!input.hasNextInt()) {
                                input.next();
                                System.out.println("Wrong input! Only numbers allowed, input again");
                            }
                            deposit = input.nextInt();
                        }
                        balance = whileDoWhileLogic.depositAmount(balance, deposit);
                    } else if ("N".equalsIgnoreCase(depositApprove)) {
                        break;
                    } else {
                        System.out.println("Wrong input. Try only Y or N");
                    }
                } while (true);
            } else if ("w".equalsIgnoreCase(chooseTransaction)) {
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
                        while (whileDoWhileLogic.isInputNotPositive(withdraw)) {
                            System.out.println();
                            System.out.println("Wrong input, cant' be negative or zero. input again");
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
            }else if ("e".equalsIgnoreCase(chooseTransaction)){
                break;
            }else {
                System.out.println("Wrong input! Input only D, W or E");
            }
        } while (true);
    }
}
