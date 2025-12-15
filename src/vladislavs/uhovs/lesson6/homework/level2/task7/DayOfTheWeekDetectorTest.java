package vladislavs.uhovs.lesson6.homework.level2.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfTheWeekDetectorTest {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    @BeforeEach
    void setUp() {
        dayOfTheWeekDetector = new DayOfTheWeekDetector();
    }

    @Test
    @DisplayName("Test for switch number 1, should return day Monday.")
    void switchNumberOneEqualsMonday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(1);
        assertEquals("Monday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 2, should return day Tuesday.")
    void switchNumberTwoEqualsTuesday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(2);
        assertEquals("Tuesday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 3, should return day Wednesday.")
    void switchNumberThreeEqualsWednesday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(3);
        assertEquals("Wednesday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 4, should return day Thursday.")
    void switchNumberFourEqualsThursday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(4);
        assertEquals("Thursday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 5, should return day Friday.")
    void switchNumberFiveEqualsFriday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(5);
        assertEquals("Friday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 6, should return day Saturday.")
    void switchNumberSixEqualsSaturday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(6);
        assertEquals("Saturday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number 7, should return day Sunday.")
    void switchNumberSevenEqualsSunday(){
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(7);
        assertEquals("Sunday", dayOfTheWeek);
    }

    @Test
    @DisplayName("Test for switch number that's not equal to days count.")
    void switchNumberNotDaysCountEqualNotCorrectDayNumber(){
        String dayCheck = "Not correct day number";
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(99);
        assertEquals(dayCheck, dayOfTheWeek);
    }
}
