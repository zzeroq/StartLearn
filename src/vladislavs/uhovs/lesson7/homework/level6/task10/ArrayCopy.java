package vladislavs.uhovs.lesson7.homework.level6.task10;


import java.util.Arrays;

public class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int count = numbersFrom(in, numberFrom, numberTo);
        return copyElements(in, numberFrom, numberTo, count);
    }

    int numbersFrom(int[] array, int from, int to){
        int count = 0;
        for (int num : array) {
            if (isInRange(num, from, to)) {
                count++;
            }
        }
        return count;
    }

    private int[] copyElements(int[] array, int from, int to, int size) {
        int[] result = new int[size];
        int index = 0;

        for (int num : array) {
            if (isInRange(num, from, to)) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    private boolean isInRange(int number, int from, int to) {
        return number >= from && number <= to;
    }
}
