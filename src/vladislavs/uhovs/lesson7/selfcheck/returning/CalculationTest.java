package vladislavs.uhovs.lesson7.selfcheck.returning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {
    Calculation calculation;

    @BeforeEach
    public void setUp(){
        calculation = new Calculation();
    }

    @Test
    @DisplayName("Calculation of sum is correct")
    public void sum(){
        double expected = 10;
        assertEquals(expected, calculation.calculate(3,7, "+"), 0.00001);
    }

    @Test
    @DisplayName("Calculation of divide is correct")
    public void divide(){
        double expected = 10;
        assertEquals(expected, calculation.calculate(30,3, "/"), 0.00001);
    }

    @Test
    @DisplayName("Should throw exception because cannot divide by zero")
    public void divideZero(){
        assertThrows(IllegalArgumentException.class, () -> calculation.calculate(15,0, "/"));
    }

    @Test
    @DisplayName("Should calculate expected subtraction with negative numbers")
    public void subtractionNegative(){
        double expected = 5;
        assertEquals(expected, calculation.calculate(-15,-20, "-"), 0.00001);
    }
    @Test
    @DisplayName("Should calculate expected subtraction with one negative number")
    public void subtractionNegativeOne(){
        double expected = -35;
        assertEquals(expected, calculation.calculate(-15,20, "-"), 0.00001);
    }

    @Test
    @DisplayName("Should calculate expected multiply")
    public void multiply(){
        double expected = 50;
        assertEquals(expected, calculation.calculate(10,5, "*"), 0.00001);
    }
    @Test
    @DisplayName("Should calculate expected multiply with zeros")
    public void multiplyZero(){
        double expected = 0;
        assertEquals(expected, calculation.calculate(0,0, "*"), 0.00001);
    }
    @Test
    @DisplayName("Should calculate expected multiply with negative numbers")
    public void multiplyNegative(){
        double expected = 30;
        assertEquals(expected, calculation.calculate(-15,-2, "*"), 0.00001);
    }

    @Test
    @DisplayName("Should calculate expected percentage")
    public void percentage(){
        double expected = 30;
        assertEquals(expected, calculation.calculate(15,200, "%"), 0.00001);
    }

}
