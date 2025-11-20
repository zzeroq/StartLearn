package vladislavs.uhovs.lesson3.homework.circle;

public class Circle {

    double radius;

    Circle(double radius){
        this.radius=radius;

    }


    public double calculateArea(){

        return Math.PI*Math.pow(radius,2);


    }


}
