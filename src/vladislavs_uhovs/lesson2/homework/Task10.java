package vladislavs_uhovs.lesson2.homework;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner radius = new Scanner(System.in);

        System.out.println("Tell me R Circle - ");
        double R = radius.nextDouble(); // Circle Radius = 7.5
        System.out.printf("Circle perimeter = %.2f%n", 2*Math.PI*R);
        System.out.printf("Circle area = %.2f%n", Math.PI*(Math.pow(R,2)));


    }

}
