package vladislavs.uhovs.lesson7.homework.level6.task8.wrong;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CreditCardTwo creditCardTwo = new CreditCardTwo(input);


        System.out.println(creditCardTwo.balance);
        String cardNumber = creditCardTwo.createCreditCardNumber(input);
        System.out.println(cardNumber);
        String pinNumber = creditCardTwo.createCreditCardPin(input);
        System.out.println(pinNumber);


        creditCardTwo.moneyFlow();
        System.out.println(creditCardTwo.balance);
        System.out.println(creditCardTwo.debt);
        System.out.println(creditCardTwo.creditLeft);
        creditCardTwo.moneyFlow();
        System.out.println(creditCardTwo.balance);
        System.out.println(creditCardTwo.debt);
        System.out.println(creditCardTwo.creditLeft);
        creditCardTwo.moneyFlow();
        System.out.println(creditCardTwo.balance);
        System.out.println(creditCardTwo.debt);
        System.out.println(creditCardTwo.creditLeft);






    }
}
