package vladislavs_uhovs.lesson3.lesson.human;

public class Human {

    String name;

    Human(String name) {
        this.name = name;
    }

    void greet(){
        System.out.println("Hello! My name is " + name + "!");
    }

}
