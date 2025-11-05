package vladislavs.lesson3;

public class RobotApplication {

    public static void main(String[] args) {

        Robot robot = new Robot("BeepBee");


        robot.sayHello();
        robot.changeNickName("PlasmaDestroyer");
        robot.sayHello();

    }


}
