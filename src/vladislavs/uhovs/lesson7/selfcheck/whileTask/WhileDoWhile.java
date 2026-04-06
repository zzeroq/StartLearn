package vladislavs.uhovs.lesson7.selfcheck.whileTask;

import java.util.Scanner;

public class WhileDoWhile {

    public static void main(String[] args) {

        int number = 0;
        int numberTwo = 1000;
        Scanner input = new Scanner(System.in);

        while (number < 10){
            number++;
            System.out.println(number);
        }

        System.out.println("Input amount to withdraw");
        do {
            System.out.println("Your balance now: " + numberTwo);
            System.out.println("Do you want to withdraw? Y/N");
            String YesNo = input.next();
            if (YesNo.equals("Y") || YesNo.equals("y")){
                System.out.println("Input amount to withdraw");
                if (!input.hasNextInt()){
                    input.next();
                    System.out.println("Wrong input! Only numbers allowed");
                    continue;
                }
                int withdraw = input.nextInt();
                if (withdraw <= numberTwo){
                    numberTwo = numberTwo - withdraw;
                }else {
                    System.out.println("Sorry you don't have enough funds to withdraw");
                }

            }else if (YesNo.equals("N") || YesNo.equals("n")){
                break;
            }else {
                System.out.println("Wrong input. Try only Y or N");
            }
        }while (true);
    }
}
