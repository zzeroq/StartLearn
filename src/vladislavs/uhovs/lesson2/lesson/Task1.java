package vladislavs.uhovs.lesson2.lesson;

public class Task1 {

    public static void main(String[] args) {
        String S_formula = "Math.sqrt(P*(P-num1)*(P-num2)*(P-num3))";


        double num1 = 12;
        double num2 = 17;
        double num3 = 15;
        double triangle_P = (num1 + num2 + num3)/2;
        System.out.println("triangle_P =" + triangle_P );

        double triangle_S = Math.sqrt(triangle_P*(triangle_P-num1)*(triangle_P-num2)*(triangle_P-num3));
        System.out.println("triangle_S = " + triangle_S);


    }


}
