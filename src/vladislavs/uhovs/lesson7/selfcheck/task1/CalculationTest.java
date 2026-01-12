package vladislavs.uhovs.lesson7.selfcheck.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationTest {
    Calculation calculation;

    @BeforeEach
    public void setUp(){
        calculation = new Calculation();
    }

    @Test
    @DisplayName("Should calculate expected sum")
    public void sum(){
        int expected = 15;
        assertEquals(expected, calculation.sum(10,5));
    }
    @Test
    @DisplayName("Should calculate expected sum with zeros")
    public void sumZero(){
        int expected = 0;
        assertEquals(expected, calculation.sum(0,0));
    }
    @Test
    @DisplayName("Should calculate expected sum with negative numbers")
    public void sumNegative(){
        int expected = -35;
        assertEquals(expected, calculation.sum(-15,-20));
    }
    @Test
    @DisplayName("Should calculate expected sum with one negative number")
    public void sumNegativeOne(){
        int expected = 5;
        assertEquals(expected, calculation.sum(-15,20));
    }

    @Test
    @DisplayName("Should calculate expected subtraction")
    public void subtract(){
        int expected = 5;
        assertEquals(expected, calculation.subtract(10,5));
    }
    @Test
    @DisplayName("Should calculate expected subtraction with zeros")
    public void subtractionZero(){
        int expected = 0;
        assertEquals(expected, calculation.subtract(0,0));
    }
    @Test
    @DisplayName("Should calculate expected subtraction with negative numbers")
    public void subtractionNegative(){
        int expected = 5;
        assertEquals(expected, calculation.subtract(-15,-20));
    }
    @Test
    @DisplayName("Should calculate expected subtraction with one negative number")
    public void subtractionNegativeOne(){
        int expected = -35;
        assertEquals(expected, calculation.subtract(-15,20));
    }

    @Test
    @DisplayName("Should calculate expected multiply")
    public void multiply(){
        int expected = 50;
        assertEquals(expected, calculation.multiply(10,5));
    }
    @Test
    @DisplayName("Should calculate expected multiply with zeros")
    public void multiplyZero(){
        int expected = 0;
        assertEquals(expected, calculation.multiply(0,0));
    }
    @Test
    @DisplayName("Should calculate expected multiply with negative numbers")
    public void multiplyNegative(){
        int expected = 30;
        assertEquals(expected, calculation.multiply(-15,-2));
    }
    @Test
    @DisplayName("Should calculate expected multiply with one negative number")
    public void multiplyNegativeOne(){
        int expected = -300;
        assertEquals(expected, calculation.multiply(-15,20));
    }

    @Test
    @DisplayName("Should calculate expected divide")
    public void divide(){
        int expected = 2;
        assertEquals(expected, calculation.divide(10,5));
    }
    @Test
    @DisplayName("Should throw exception because cannot divide by zero")
    public void divideZero(){
        assertThrows(IllegalArgumentException.class, () -> calculation.divide(0,0));
    }
    @Test
    @DisplayName("Should calculate expected divide with negative numbers")
    public void divideNegative(){
        int expected = 15;
        assertEquals(expected, calculation.divide(-30,-2));
    }
    @Test
    @DisplayName("Should calculate expected divide with one negative number")
    public void divideNegativeOne(){
        int expected = -8;
        assertEquals(expected, calculation.divide(-16,2));
    }

}
