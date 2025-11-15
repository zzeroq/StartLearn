package vladislavs_uhovs.lesson_3.checkMyself;

import java.util.Scanner;

public class Check {
   // Сегодня 7-ой день учёбы. Я напишу код и хочу узнать ошибки и то насколько я продвинулся в учебе за эти дни по сравнению с другими новичами.

    public static class Calculation {

        public static void main(String[] args) {


            int number1 = 5;
            int number2 = 15;
            int sum = number2 + number1;
            System.out.println(number1 + " + " + number2 + " = " + sum);
            int divide = number2 / number1;
            System.out.println(number2 + " / " + number1 + " = " + divide);
            int multiply = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + multiply);
            int subtract = number2 - number1;
            System.out.println(number1 + " - " + number2 + " = " + subtract);

        }

    }
    //новый класс


    public static class ScannerCalculation {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Int 1 = ");
            int number1 = input.nextInt();
            System.out.println("Int 2 = ");
            int number2 = input.nextInt();

            System.out.println("Sum = " + (number1 + number2));
            System.out.println("Subtract = " + (number1 - number2));
            System.out.println("Divide = " +  ((double)number1 / (double)number2));
            System.out.println("Multiply = " + (number1 * number2));




        }
    }
//    новый класс

    public static class ScannerDouble {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Double 1 = ");
            double number1 = input.nextDouble();
            System.out.println("Double 2 = ");
            double number2 = input.nextDouble();

            System.out.println("Sum = " + (number1 + number2));
            System.out.println("Subtract = " + (number1 - number2));
            System.out.println("Divide = " + (number1 / number2));
            System.out.println("Multiply = " + (number1 * number2));


        }


    }

    public static class Hello {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Tell me Your name - ");
            String name = input.nextLine();
            System.out.println("Hello " + name);
        }



    }

    /* Types
    int i = 2; (-2^31... 2^31-1)
    short s = 3; (-32000 ... 32000-1)
    byte b = 4; (-128...127)
    long l = 5L; (-2^63... 2^63) all the time in the end of the number L.
    double d = 6.0
    float f = 6.0f

    String s = "text";
    char c = 'a';
    boolean b = true/false;
    */
   // новый класс
    public static class LoginService {

        public static void main(String[] args) {

            System.out.println("You can login!");


        }

    }

  //  новый класс
    public static class HelloWorld {

        public static void main(String [] args){

            String hello = "Hello world!";

            System.out.println(hello);

        }
    }
    // новый класс

    public static class MathDemo {


        public static void main (String [] args){

            double number1 = Math.pow(2,4);
            System.out.println(number1);
            double number2 = Math.PI*2;
            System.out.println(number2);
            double number3 = Math.sqrt(33);
            System.out.printf("%.2f%n", number3);


        }


    }
    // новый класс
    public static class Robot {

        private final String name;
        private final String color;
        private final int price;

        Robot(String name, String color, int price) {

            this.name = name;
            this.color = color;
            this.price = price;
        }
        public String getName(){
            return this.name;

        }
        public String getColor(){
            return this.color;

        }
        public int getPrice(){
            return this.price;

        }



        public void sayName() {
            System.out.println("My name is - " + name);
        }
    }


  //  Новый класс для Robot

    public static class RobotDapp{

        public static void main(String [] args){


            Robot newRobot = new Robot("Gary","Red", 17000);

            System.out.println("New robot :");
            System.out.println("Name -" + newRobot.getName());
            System.out.println("Color -" + newRobot.getColor());
            System.out.println("Price -" + newRobot.getPrice());

            newRobot.sayName();

        }


    }
    public static class RobotTwo {

        String name2;
        String color2;
        int price2;

        RobotTwo(String name2, String color2, int price2) {

            this.name2 = name2;
            this.color2 = color2;
            this.price2 = price2;
        }
        public String getName2(){
            return this.name2;

        }
        public String getColor2(){
            return this.color2;

        }
        public int getPrice2(){
            return this.price2;

        }



        public void roboName2 (){
            System.out.println("My name is - " + name2);
        }

        public void changeRoboName (String newRoboName){
            this.name2 = newRoboName; // этот весь код пришлось подсмотреть

        }


    }


   // Новый класс для Robot

    public static class RobotDapp2{

        public static void main(String [] args){


            RobotTwo newRobot2 = new RobotTwo("Gary2","Red2", 27000);

            System.out.println("New robot :");
            System.out.println("Name -" + newRobot2.getName2());
            System.out.println("Color -" + newRobot2.getColor2());
            System.out.println("Price -" + newRobot2.getPrice2());
            System.out.println("Better battery Price -" + (newRobot2.price2 + 1000));


            newRobot2.roboName2();
            newRobot2.changeRoboName("Blast9000");// пришлось подсмотреть, не смог вспомнить...
            newRobot2.roboName2();

        }


    }

    public static class Circle {

        public static void main (String [] args){

            java.util.Scanner input = new Scanner (System.in);

            System.out.println("What is is circle R? = ");
            double R = input.nextInt();
            System.out.println(R);

            double circle_P = 2 * Math.PI * R;
            System.out.println("Perimeter = " + circle_P);
            double circle_S = (Math.PI * Math.pow(R, 2));
            System.out.println("Area of circle = " + circle_S);



        }



    }
    // System.out.println("New robot :"); - весь код это выходит функия или statement?
// я знаю что в int number1 = 2; int-type, number1 - variable, 2 - state; '=' - operator or assignment operator и весь код называется statement.
   // Это всё я написал без подсказок, всё по памяти и сам придумывал классы, интересно сколько будет ошибок. Следующая тема у меня будет if-statement.
}
