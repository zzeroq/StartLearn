package vladislavs.uhovs.lesson5.homework.level5and6.task31to40;

public class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray(){

        Arrays arrays = new Arrays();

        int[] realResult = arrays.create(5);

        if (realResult.length == 5){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void shouldFindMaxNumber() {

        Arrays arrays = new Arrays();
        int[] numbers = {4,6,7,1,3};
        int expectedResult = 7;
        int realResult = arrays.findMax(numbers);
        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
    public void shouldFindMinNumber() {
        Arrays arrays = new Arrays();
        int[] numbers = {4,6,7,1,3};
        int expectedResult = 1;
        int realResult = arrays.findMin(numbers);
        if (expectedResult == realResult){
            System.out.println("Test: OK!");
        }else {
            System.out.println("Test: FAIL!");
        }
    }
}
