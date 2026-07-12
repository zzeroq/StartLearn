package vladislavs.uhovs.lesson7.selfcheck;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        CalcLog calcLog = new CalcLog();
        Scanner input = new Scanner(System.in);
        boolean operatorWrong = true;

        while (operatorWrong) {
            System.out.println("Input number 1");
            int num1 = input.nextInt();

            System.out.println("Input one of the operators: +,-,/,*");
            String operator = input.next();

            System.out.println("Input number 2");
            int num2 = input.nextInt();

            try{
                System.out.println(calcLog.calculate(num1, num2, operator));
                operatorWrong = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }


}
