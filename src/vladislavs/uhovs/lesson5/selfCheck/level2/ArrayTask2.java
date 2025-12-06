package vladislavs.uhovs.lesson5.selfCheck.level2;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {

    public int[] randomNumbers(int length){
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input array length: ");
        int numbers = input.nextInt();
        ArrayTask2 arrayTask2 = new ArrayTask2();
        int[] array = arrayTask2.randomNumbers(numbers);

        for (int i = 0; i < array.length ; i++) {
            if (i > 0){
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        input.close();
    }

}
