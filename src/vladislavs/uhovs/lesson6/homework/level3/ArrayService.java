package vladislavs.uhovs.lesson6.homework.level3;

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
}
