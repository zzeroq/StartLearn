package vladislavs.uhovs.lesson5.lesson.array;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int[] rates = new int[24];

        System.out.println("rates = " + Arrays.toString(rates));

        rates[0] = 50;
        rates[1] = 49;
        rates[2] = 43;
        rates[3] = 45;
        rates[4] = 41;
        rates[5] = 40;
        rates[6] = 33;
        rates[7] = 32;
        rates[8] = 21;
        rates[9] = 22;
        rates[10] = 27;
        rates[11] = 55;
        rates[12] = 44;
        rates[13] = 43;
        rates[14] = 19;
        rates[15] = 12;
        rates[16] = 25;
        rates[17] = 29;
        rates[18] = 38;
        rates[19] = 44;
        rates[20] = 49;
        rates[21] = 56;
        rates[22] = 77;
        rates[23] = 48;
        rates[rates.length - 1] = 100;
        System.out.println("rates = " + Arrays.toString(rates));
        System.out.println("rates 1 = " + rates[1]);
        System.out.println("rates 2 = " + rates[2]);


    }
}
