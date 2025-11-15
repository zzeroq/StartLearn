package vladislavs_uhovs.lesson_3.homework.product;

public class ProductDemo {

    public static void main(String[] args) {


        Product product = new Product("Steak");
        product.regularPrice = 16.99;
        product.discount = 0.22;

        product.printInformation();


    }



}
