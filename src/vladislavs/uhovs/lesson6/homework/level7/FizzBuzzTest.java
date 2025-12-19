package vladislavs.uhovs.lesson6.homework.level7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Should return FizzBuzz if divided by 3 and 5")
    public void returnFizzBuzz(){
        String expected = "FizzBuzz";
        assertEquals(expected, fizzBuzz.detect(45));
    }

    @Test
    @DisplayName("Should return Fizz if divided by 3 and not by 5")
    public void returnFizz(){
        String expected = "Fizz";
        assertEquals(expected, fizzBuzz.detect(9));
    }

    @Test
    @DisplayName("Should return Buzz if divided by 5 and not by 3")
    public void returnBuzz(){
        String expected = "Buzz";
        assertEquals(expected, fizzBuzz.detect(20));
    }

    @Test
    @DisplayName("Should return False if not divided by 3 and 5")
    public void falseIfNotDivided(){
        assertEquals("11", fizzBuzz.detect(11));
    }

}
