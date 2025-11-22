package vladislavs.uhovs.lesson4.homework.level6.task16;

public class StockDemo {
    public static void main(String[] args) {

        Stock stock = new Stock("FunFood ",15);
        String priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);


        stock.updatePrice(25);
        stock.updatePrice(5);
        stock.updatePrice(21);
        System.out.println();
        priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);

    }
}
