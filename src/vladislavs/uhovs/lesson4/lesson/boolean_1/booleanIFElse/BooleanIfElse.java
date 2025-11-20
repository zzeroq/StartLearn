package vladislavs.uhovs.lesson4.lesson.boolean_1.booleanIFElse;

public class BooleanIfElse {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        boolean f1 = true;
        boolean f2 = false;

        int calc1 = x + y;
        int calc2 = y - x;
        int calc3 = x * y;
        boolean check1 = calc1 <= x;
        boolean check2 = calc2 >= y;
        boolean check3 = calc3 <= y;
        boolean check4 = calc3 >= y;

        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);


        if (check4 != f2){
            System.out.println("True!!!");
        }else System.out.println("False!");

        System.out.print("I will go workout on ");
        if (check1 == f1){
            System.out.println("monday!");
        }else if (check2 != f2) {
            System.out.println("tuesday!");
        }else if  (check3 && check4){
            System.out.println("wednesday!");
        }else {
            System.out.println("thursday!");
        }





    }





}
