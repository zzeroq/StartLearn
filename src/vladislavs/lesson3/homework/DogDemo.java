package vladislavs.lesson3.homework;

import java.util.Scanner;

public class DogDemo {

    public static void main (String[] args) {

        Dog dog = new Dog("Hercules");

        System.out.println("Dogs name - " + dog.getNickName());

        dog.voice();

    }



}
