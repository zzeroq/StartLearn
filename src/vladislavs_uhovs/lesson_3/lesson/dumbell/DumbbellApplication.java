package vladislavs_uhovs.lesson_3.lesson.dumbell;

public class DumbbellApplication {


    public static void main(String[] args) {

        Dumbbell dumbbell1 = new Dumbbell("Black", 10);
        Dumbbell dumbbell2 = new Dumbbell("Green", 20);
        Dumbbell dumbbell3 = new Dumbbell("Gold", 30);




        System.out.println("Dumbbell Color - " + dumbbell1.color);
        System.out.println("Dumbbell Weight kg - " + dumbbell1.weight);
        System.out.println(" ");
        System.out.println("Dumbbell Color - " + dumbbell2.color);
        System.out.println("Dumbbell Weight kg - " + dumbbell2.weight);
        System.out.println(" ");
        System.out.println("Dumbbell Color - " + dumbbell3.color);
        System.out.println("Dumbbell Weight - kg " + dumbbell3.weight);
        System.out.println(" ");


        Dumbbell dumbbell4 = new Dumbbell("Black");

        System.out.println("Dumbbell Color - " + dumbbell4.color);
        System.out.println("Dumbbell Weight kg - " + dumbbell4.weight);
        System.out.println(" ");

        dumbbell4.weight = dumbbell4.weight +10;
        System.out.println("Dumbbell Color - " + dumbbell4.color);
        System.out.println("Dumbbell Weight kg - " + dumbbell4.weight);
        System.out.println(" ");





    }



}
