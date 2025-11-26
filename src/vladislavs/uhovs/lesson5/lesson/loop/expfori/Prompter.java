package vladislavs.uhovs.lesson5.lesson.loop.expfori;

import java.util.Scanner;

public class Prompter {

    Scanner input;

    public Prompter(){
        this.input = new Scanner(System.in);
    }


    int promptLength(){
        System.out.println("Please enter desired password length: ");
        return input.nextInt();
    }

    boolean promptAlpha(){
        System.out.println("Should i include alpha characters [a-z]?");
        return input.nextBoolean();
    }
    boolean promptAlphaBig(){
        System.out.println("Should i include alpha characters [A-Z]?");
        return input.nextBoolean();
    }
    boolean promptNumeric(){
        System.out.println("Should i include alpha characters [1-9]?");
        return input.nextBoolean();
    }
    boolean promptSpecial(){
        System.out.println("Should i include alpha characters [@-%]?");
        return input.nextBoolean();
    }
}
