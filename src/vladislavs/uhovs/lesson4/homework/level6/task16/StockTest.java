package vladislavs.uhovs.lesson4.homework.level6.task16;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();

        stockTest.priceNowTest();
        stockTest.priceMinTest();
        stockTest.priceMaxTest();

    }
    public void priceNowTest(){

        int expectedResult = 21;
        Stock stock = new Stock("FunFood ",15);
        stock.updatePrice(25);
        stock.updatePrice(5);
        stock.updatePrice(21);
        int realResult = stock.getPriceNow();

        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void priceMinTest(){

        int expectedResult = 5;
        Stock stock = new Stock("FunFood ",15);
        stock.updatePrice(25);
        stock.updatePrice(5);
        stock.updatePrice(21);
        int realResult = stock.getPriceMin();

        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void priceMaxTest(){

        int expectedResult = 25;
        Stock stock = new Stock("FunFood ",15);
        stock.updatePrice(25);
        stock.updatePrice(5);
        stock.updatePrice(21);
        int realResult = stock.getPriceMax();

        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }

}
