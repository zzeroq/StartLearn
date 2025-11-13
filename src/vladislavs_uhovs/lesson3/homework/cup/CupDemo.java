package vladislavs_uhovs.lesson3.homework.cup;

public class CupDemo {

    public static void main(String[] args) {

        Cup newCup = new Cup("Black",50,"Small");
        Cup newCup2 = new Cup("Green",75,"Middle");

        System.out.println("Cup of tea : " + newCup.getColor() +" color, "+ newCup.getGram() +" gram, "+ newCup.getSize() + " size");
        System.out.println("Cup of coffee : " + newCup2.getColor() +" color, "+ newCup2.getGram() +" gram, "+ newCup2.getSize() + " size");

        System.out.println();
        System.out.println("Cup of tea size: ");
        newCup.sizeCheck();

        System.out.println();
        System.out.println("Cup of tea color: ");
        newCup.colorCheck();

        System.out.println();
        System.out.println("Change cup of tea size: ");
        newCup.changeSize("Big ");
        newCup.sizeCheck();

        System.out.println();
        System.out.println("Cup of coffee gram: ");
        newCup2.checkGram();

        System.out.println();
        System.out.println("Change cup of coffee gram: ");
        newCup2.changeGram(85);
        newCup2.checkGram();



    }


}
