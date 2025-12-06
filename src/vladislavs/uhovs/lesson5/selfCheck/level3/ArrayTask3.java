package vladislavs.uhovs.lesson5.selfCheck.level3;

import java.util.Random;

public class ArrayTask3 {

    private Random random;

    public ArrayTask3(Random random){
        this.random = random;
    }
    public int[] createArrayRandom(int length){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
