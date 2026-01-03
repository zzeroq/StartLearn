package vladislavs.uhovs.lesson7.homework.level5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PowerCalculatorTest {

    PowerCalculator powerCalculator;

    @BeforeEach
    public void setUp(){
       powerCalculator = new PowerCalculator();
    }

    @Test
    @DisplayName("Should calculate power")
    public void powerCalculation(){
        int expected = 16;
        assertEquals(expected, powerCalculator.power(4,2));
    }

    @Test
    @DisplayName("Should calculate zero power")
    public void powerCalculationZero(){
        int expected = 1;
        assertEquals(expected, powerCalculator.power(0,0));
    }

    @Test
    @DisplayName("Should calculate negative number and get positive result")
    public void powerCalculationNegativeNumber(){
        int expected = 16;
        assertEquals(expected, powerCalculator.power(-4,2));
    }

    @Test
    @DisplayName("Should calculate negative number and get negative result")
    public void powerCalculationNegativeResult(){
        int expected = -64;
        assertEquals(expected, powerCalculator.power(-4,3));
    }

    @Test
    @DisplayName("Should calculate negative power")
    public void negativeExponentThrows() {
        assertThrows(IllegalArgumentException.class, () -> powerCalculator.power(2, -1));
    }









}
