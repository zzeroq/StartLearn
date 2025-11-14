package vladislavs_uhovs.lesson3.homework.cup;

public class CupDemo {

    public static void main(String[] args) {

        Cup newCup = new Cup("Black",50,"Small");
        Cup newCup2 = new Cup("Green",75,"Middle");

        System.out.println("Cup of tea : " + newCup.getColor() +" color, "+ newCup.getGram() +" gram, "+ newCup.getSize() + " size");
        System.out.println("Cup of coffee : " + newCup2.getColor() +" color, "+ newCup2.getGram() +" gram, "+ newCup2.getSize() + " size");

        System.out.println();
        newCup.checkCup();

        System.out.println();
        newCup.changeSize("Big ");
        newCup.checkCup();

        System.out.println();
        newCup2.checkCup();

        System.out.println();
        newCup2.addGram(10);
        newCup2.checkCup();

        System.out.println();
        newCup2.removeGram(5);
        newCup2.checkCup();



    }


}
