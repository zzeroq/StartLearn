package vladislavs.uhovs.lesson5.selfCheck.level2;

import java.util.Random;

public class ArrayTask2Test {
    public static void main(String[] args) {

        ArrayTask2Test arrayTask2Test = new ArrayTask2Test();
        arrayTask2Test.randomizerLengthTest();
        arrayTask2Test.inRangeTest();
    }

    public void randomizerLengthTest() {

        ArrayTask2 arrayTask2 = new ArrayTask2();
        int[] array = arrayTask2.randomNumbers(10);

        if (array.length == 10) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: FAIL!");
        }
    }


    public void inRangeTest(){

        ArrayTask2 arrayTask2 = new ArrayTask2();
        int[] result = arrayTask2.randomNumbers(10);

        boolean InRange = true;
        for (int n : result){
            if (n < 0 || n > 9 ){
                InRange = false;
                break;
            }
        }
        if(InRange){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: Fail!");
        }
    }
}