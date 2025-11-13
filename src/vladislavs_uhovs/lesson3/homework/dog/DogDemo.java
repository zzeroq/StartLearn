package vladislavs_uhovs.lesson3.homework.dog;

public class DogDemo {

    public static void main (String[] args) {


        Dog dog = new Dog("Hercules","Black");

        System.out.println("Dogs name - " + dog.getNickName());

        System.out.println();
        dog.voice();

        System.out.println();
        dog.setAge(5);

        System.out.println();
        dog.voice();

        System.out.println();
        dog.happyBirthday();

        System.out.println();
        dog.voice();

        dog.changeColor("White");
        System.out.println();
        dog.voice();

        dog.changeColor("Brown");
        System.out.println();
        dog.voice();











    }



}
