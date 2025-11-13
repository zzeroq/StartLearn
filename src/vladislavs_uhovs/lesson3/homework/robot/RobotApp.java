package vladislavs_uhovs.lesson3.homework.robot;

public class RobotApp {

    public static void main(String[] args) {


        Robot robot0 = new Robot("Golden ",99, "C3x00");
        Robot robot1 = new Robot("Silver", 89,"Super1");
        Robot robot2 = new Robot("Black", 152, "BigBoom99");

        System.out.println("Robot0 color - " + robot0.color);
        System.out.println("Robot0 weight - " + robot0.weight);
        System.out.println("Robot1 color - " + robot1.color);
        System.out.println("Robot1 weight - " + robot1.weight);
        System.out.println("Robot2 color - " + robot2.color);
        System.out.println("Robot2 weight - " + robot2.weight);

try {
    robot0.sayHello();
    Thread.sleep(500);
    robot0.sayYourName();
    robot0.sayYourColor();
    robot0.changeYourName("Blast");
    robot0.sayYourName();
    System.out.println();
}catch (InterruptedException e){
    e.printStackTrace();

}
        robot1.sayHello();
        robot1.sayYourName();
        robot1.sayYourColor();
        System.out.println();

        robot2.sayHello();
        robot2.sayYourName();
        robot2.sayYourColor();
        System.out.println();






    }


}
