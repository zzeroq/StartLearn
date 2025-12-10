package vladislavs.uhovs.lesson6.lesson.doWhileLesson;

import java.util.Random;

public class doWhileDemo2 {
    public static void main(String[] args) {

        System.out.println("Let's throw a 🏀");

        Random random = new Random();

        int chancePercent = 25;
        int throwSuccess;
        do {
            System.out.println("Throw a ball");
            throwSuccess = random.nextInt(100);
            System.out.println("Score: " + throwSuccess);
        } while (throwSuccess < (100 - chancePercent));

        System.out.println("You score 🔥");

    }
}
