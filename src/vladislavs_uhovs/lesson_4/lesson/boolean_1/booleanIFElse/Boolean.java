package vladislavs_uhovs.lesson_4.lesson.boolean_1.booleanIFElse;

public class Boolean {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        boolean f1 = true;
        boolean f2 = false;

        boolean areEqual = a == a; // true
        boolean notEqual = a != b; // true
        boolean greaterThen = a > b; // false
        boolean greaterThanOrEqual = b >= b; //true
        boolean lesserThan = a < b; // true

        boolean or = f1 || f2;
        boolean and = f1 && f2;
        boolean invert = !f1;

        // &&  -and
        // || or - or
        // ! - invert(not)


        boolean withinBound = 0 <= a && a <= 10;
        System.out.println(withinBound);

        if (a != b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }



    }


}
