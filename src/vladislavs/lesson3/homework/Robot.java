package vladislavs.lesson3.homework;

public class Robot {


    String nickName;
    String color;
    int weight;


    Robot(String color, int weight, String newNickName) {

        nickName = newNickName;
        this.color = color;
        this.weight = weight;

    }


    public void sayHello (){

        System.out.println("Hello!");

    }
    public void sayYourName (){

        System.out.println("My name is " + nickName);

    }
    public void sayYourColor(){

        System.out.println("My color is " + color);


    }

    public void changeYourName (String newNickName){

        nickName = newNickName;


    }



}
