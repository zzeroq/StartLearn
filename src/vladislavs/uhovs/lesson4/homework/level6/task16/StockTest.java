package vladislavs.uhovs.lesson4.homework.level6.task16;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();

        stockTest.priceNowTest();
        stockTest.priceMinTest();
        stockTest.priceMaxTest();
        stockTest.priceMaxTest2();
        stockTest.priceMinTest2();

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
    public void priceMaxTest2(){

        int expectedResult = 100;
        Stock stock = new Stock("FunFood ",15);
        stock.updatePrice(25);
        stock.updatePrice(30);
        stock.updatePrice(21);
        stock.updatePrice(45);
        stock.updatePrice(99);
        stock.updatePrice(75);
        stock.updatePrice(100);
        stock.updatePrice(88);
        int realResult = stock.getPriceMax();

        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void priceMinTest2(){

        int expectedResult = 1;
        Stock stock = new Stock("FunFood ",15);
        stock.updatePrice(250);
        stock.updatePrice(187);
        stock.updatePrice(166);
        stock.updatePrice(155);
        stock.updatePrice(134);
        stock.updatePrice(99);
        stock.updatePrice(75);
        stock.updatePrice(22);
        stock.updatePrice(1);

        int realResult = stock.getPriceMin();

        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }

}
