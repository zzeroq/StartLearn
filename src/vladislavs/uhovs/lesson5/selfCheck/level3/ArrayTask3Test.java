package vladislavs.uhovs.lesson5.selfCheck.level3;

import java.util.Random;

public class ArrayTask3Test {
    public static void main(String[] args) {

        ArrayTask3Test arrayTask3Test = new ArrayTask3Test();
        arrayTask3Test.zeroLengthTest();
    }


    public void zeroLengthTest() {
        ArrayTask3 task = new ArrayTask3(new Random());

        int[] result = task.createArrayRandom(1);

        if (result != null && result.length == 1) {
            System.out.println("zeroLengthTest: OK");
        } else {
            System.out.println("zeroLengthTest: FAIL");
        }
    }
}
