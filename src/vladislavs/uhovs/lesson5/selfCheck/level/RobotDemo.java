package vladislavs.uhovs.lesson5.selfCheck.level;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot("White", "XP01", 100, 12000);

        System.out.println("Robot color: " + robot.getColor());
        System.out.println("Roboto model: " + robot.getModel());
        System.out.println("Robot weight: " + robot.getWeight() + " KG");
        System.out.println("Robot cost: " + robot.getCost() + " EURO");
        System.out.println();

        robot.changeColor("Gold");
        robot.changeModel("CP3PO");
        robot.changeWeight(120);
        robot.changeCost(17000);

        System.out.println("Robot color: " + robot.getColor());
        System.out.println("Roboto model: " + robot.getModel());
        System.out.println("Robot weight: " + robot.getWeight() + " KG");
        System.out.println("Robot cost: " + robot.getCost() + " EURO");
    }
}
