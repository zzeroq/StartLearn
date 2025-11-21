package vladislavs.uhovs.lesson4.homework.level5.task15;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.colorTest();
        lightColorDetectorTest.colorTest2();
        lightColorDetectorTest.colorTest3();
        lightColorDetectorTest.colorTest4();
        lightColorDetectorTest.colorTest5();
        lightColorDetectorTest.colorTest6();
        lightColorDetectorTest.colorTest7();
    }

    public void colorTest() {
        int wavelength1 = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest2() {
        int wavelength1 = 449;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest3() {
        int wavelength1 = 494;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest4() {
        int wavelength1 = 569;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest5() {
        int wavelength1 = 589;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest6() {
        int wavelength1 = 619;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
    public void colorTest7() {
        int wavelength1 = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength1);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: OK!");
        } else {
            System.out.println("Test: Fail");
        }
    }
}