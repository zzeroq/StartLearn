package vladislavs.uhovs.lesson5.homework.level2.task13;


import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {

        int[] sum = new int[3];
        Random random = new Random();
        sum[0] = random.nextInt(100);
        sum[1] = random.nextInt(100);
        sum[2] = random.nextInt(100);

        int total = 0;
        for (int symbol : sum){
            total += symbol;
        }
        System.out.print(total);
    }
}
