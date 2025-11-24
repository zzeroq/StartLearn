package vladislavs.uhovs.lesson4.homework.level7.task17;

public class LeapYearTest {
    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.leapYearTest1();
        leapYearTest.leapYearTest2();
        leapYearTest.leapYearTest3();
        leapYearTest.leapYearTest4();

    }

    public void leapYearTest1(){
        int year = 1996;
        boolean expectedResult = true;
        LeapYear leapYear      = new LeapYear();
        boolean realResult     = leapYear.isLeapYear(year);

        if (realResult == expectedResult){
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail!");
        }

    }
    public void leapYearTest2(){
        int year = 2200;
        boolean expectedResult = false;
        LeapYear leapYear      = new LeapYear();
        boolean realResult     = leapYear.isLeapYear(year);

        if (realResult == expectedResult){
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail!");
        }

    }
    public void leapYearTest3(){
        int year = 2400;
        boolean expectedResult = true;
        LeapYear leapYear      = new LeapYear();
        boolean realResult     = leapYear.isLeapYear(year);

        if (realResult == expectedResult){
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail!");
        }

    }
    public void leapYearTest4(){
        int year = 2025;
        boolean expectedResult = false;
        LeapYear leapYear      = new LeapYear();
        boolean realResult     = leapYear.isLeapYear(year);

        if (realResult == expectedResult){
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail!");
        }

    }

}
