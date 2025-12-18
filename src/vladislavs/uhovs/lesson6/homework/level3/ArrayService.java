package vladislavs.uhovs.lesson6.homework.level3;


import vladislavs.uhovs.lesson5.homework.level5and6.task31to40.Arrays;

public class ArrayService {

    public boolean contains(int[] arr, int numberToSearch){
        for (int n : arr) {
            if (n == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public int countNumberInArray(int[] arr, int numberToSearch){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch){
               count++;
            }
        }
        return count;
    }

    public boolean replaceArrayFirstNumber(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public int replaceArrayNumbers(int[] arr, int numberToReplace, int newNumber){
        int howManyNumbersReplaced = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                howManyNumbersReplaced++;
            }
        }
        return howManyNumbersReplaced;
    }

    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public void sort(int[] arr) {
        java.util.Arrays.sort(arr);

        /* for (int a = 0; a < arr.length - 1; a++) {
            int minPosition = a;
            for (int i = a + 1; i < arr.length; i++) {
                if (arr[i] < arr[minPosition]) {
                    minPosition = i;
                }
            }
            int temp = arr[a];
            arr[a] = arr[minPosition];
            arr[minPosition] = temp;
        }
         */
    }

}
