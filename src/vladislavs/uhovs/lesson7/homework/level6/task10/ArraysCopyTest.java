package vladislavs.uhovs.lesson7.homework.level6.task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysCopyTest {

    ArrayCopy arrayCopy;

    @BeforeEach
    void setUp() {
        arrayCopy = new ArrayCopy();
    }

    @Test
    @DisplayName("Should copy numbers in range")
    void copyInRange() {
        int[] input = {1, 5, 10, 15, 20};
        int[] result = arrayCopy.copyInRange(input, 5, 15);
        assertArrayEquals(new int[]{5, 10, 15}, result);
    }

    @Test
    @DisplayName("Should return empty array if no numbers in range")
    void emptyResult() {
        int[] input = {1, 2, 3};
        int[] result = arrayCopy.copyInRange(input, 10, 20);
        assertEquals(0, result.length);
    }

    @Test
    @DisplayName("Should copy all numbers if all in range")
    void allInRange() {
        int[] input = {5, 10, 15};
        int[] result = arrayCopy.copyInRange(input, 1, 20);
        assertArrayEquals(new int[]{5, 10, 15}, result);
    }

}
