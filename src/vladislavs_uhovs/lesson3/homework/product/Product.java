package vladislavs_uhovs.lesson3.homework.product;

public class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name){

        this.name=name;

    }
    public String getName(){
        return this.name;
    }


    public double actualPrice(){

        return regularPrice-(regularPrice*discount);

    }
    public void printInformation(){



        System.out.println("Product: " + name);
        System.out.println("Price: " + regularPrice);
        System.out.println("Discount: " + discount*100 + "%");
        System.out.println();

        System.out.printf("22%% discount!! New price - %.2f%n", actualPrice());


    }

}
