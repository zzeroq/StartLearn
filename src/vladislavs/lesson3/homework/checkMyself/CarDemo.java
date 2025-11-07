package vladislavs.lesson3.homework.checkMyself;

public class CarDemo {

    public static void main(String[] args) {


        Car car1 = new Car("Honda",12000);// object, name of the new object, assignment, new object, (values, literals)


        System.out.println("Car - " + car1.getName()); // function
        System.out.println("Cost - " + car1.getCost()); // function


        System.out.println(car1.sound());
        car1.sound2();

    }




}
