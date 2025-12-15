package vladislavs.uhovs.lesson6.homework.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest {


    private NumberUtils numberUtils;

    @BeforeEach
    void setUp(){
        numberUtils = new NumberUtils();
    }

    @Test
    @DisplayName("IsEven: returns true for positive even number")
    void isEvenTest(){
        assertTrue(numberUtils.isEven(2));
    }

    @Test
    @DisplayName("isEven: returns false for positive odd number")
    void notEvenTest(){
        assertFalse(numberUtils.isEven(1));
    }

    @Test
    @DisplayName("isEven: returns true for zero")
    void zeroIsEvenTest(){
        assertTrue(numberUtils.isEven(0));
    }

    @Test
    @DisplayName("isEven: returns false for negative odd number")
    void notEvenTest2(){
        assertFalse(numberUtils.isEven(-3));
    }

    @Test
    @DisplayName("isEven: returns true for Integer.MIN_VALUE (boundary case)")
    void minValueTest(){
        assertTrue(numberUtils.isEven(Integer.MIN_VALUE));
    }
}
