package vladislavs.uhovs.lesson6.lesson.slotMachine;

import java.util.Scanner;

public class SlotPrompter {

    Scanner input;

    SlotPrompter(Scanner input){
        this.input = input;
    }

    boolean playNextGame(){
        System.out.print("💵 You PLAY [Y/N]: ");
        return "Y".equals(input.nextLine());
    }

    boolean wantDeposit(){
        System.out.println("💰 You want to deposit? [Y/N]: ");
        return "Y".equals(input.nextLine());
    }

    int promptDepositAmount(){
        System.out.println("Deposit amount");
        int amount = input.nextInt();
        input.nextLine();
        return amount;
    }

}
