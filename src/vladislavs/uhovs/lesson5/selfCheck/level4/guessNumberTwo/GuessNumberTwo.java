package vladislavs.uhovs.lesson5.selfCheck.level4.guessNumberTwo;

import java.util.Random;

public class GuessNumberTwo {

    private final Random random;

    public GuessNumberTwo(){
        this(new Random());
    }

    public GuessNumberTwo(Random random){
        this.random = random;
    }

    public int getRandom(int number){
        return random.nextInt(number);
    }
}
