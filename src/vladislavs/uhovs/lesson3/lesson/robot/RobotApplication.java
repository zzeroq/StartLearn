package vladislavs.uhovs.lesson3.lesson.robot;

public class RobotApplication {

    public static void main(String[] args) {

        Robot robot = new Robot("BeepBee...");


        robot.sayHello();
        robot.changeNickName("PlasmaDestroyer!!!");
        robot.sayHello();

    }


}
