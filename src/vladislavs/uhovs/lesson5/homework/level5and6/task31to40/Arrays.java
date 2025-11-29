package vladislavs.uhovs.lesson5.homework.level5and6.task31to40;

import java.util.Random;

public class Arrays {

    public int[] create(int length) {
      int[] number = new int[length];
      return number;
    }
    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0){
                System.out.println(" ");
            }
            System.out.println(array[i]);
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
