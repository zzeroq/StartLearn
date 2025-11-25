package vladislavs.uhovs.lesson4.homework.level7.task20;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    public void checkResult(String testName, String result, String expectedResult){


        if (result.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }

    }

    private final LightColorDetector lightColorDetector = new LightColorDetector();

    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test violet color", result, "Violet");
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test blue color", result, "Blue");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test green color", result, "Green");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test yellow color", result, "Yellow");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test orange color", result, "Orange");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test red color", result, "Red");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResult("Test invisible light color", result, "Invisible Light");
    }
}
