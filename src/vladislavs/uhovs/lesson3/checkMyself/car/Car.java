package vladislavs.uhovs.lesson3.checkMyself.car;

public class Car {

    private final String name; //private field, type, variable
    private final int cost;

    Car(String name, int cost){
        this.cost = cost; // variable
        this.name = name; // variable

    }//class(type, variable, type, variable){method}

    public String getName () {

        return this.name;


    }

    public int getCost () {

        return this.cost;


    }//getter function

    public String sound (){
        return "Beep!";

    }// getter function

    public void sound2(){
        System.out.println("Beep!!");


    }






}
