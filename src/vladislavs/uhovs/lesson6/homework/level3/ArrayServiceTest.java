package vladislavs.uhovs.lesson6.homework.level3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayServiceTest {

    private ArrayService arrayService;

    @BeforeEach
    void setUp() {
        arrayService = new ArrayService();
    }

    @Test
    @DisplayName("If numberCheck is in array, test is True")
    void ifNumberIsInArrayTrue(){
        int[] arr = {3,4,5,6,7};
        int numberToSearch = 5;
        assertTrue(arrayService.contains(arr, numberToSearch));
    }

    @Test
    @DisplayName("If numberCheck is not in array, test is False")
    void ifNumberIsNotInArrayFalse(){
        int[] arr = {3,4,0,6,7};
        int numberToSearch = 5;
        assertFalse(arrayService.contains(arr, numberToSearch));
    }

    @Test
    @DisplayName("Test is true if numberCheck count in array is correct")
    void numberCheckCountInArrayReturnOne(){
        int[] arr = {3,4,3,5,5};
        int numberToSearch = 4;
        assertEquals(1, arrayService.countNumberInArray(arr, numberToSearch));
    }

    @Test
    @DisplayName("Test is true if numberCheck count in array is zero")
    void numberCheckCountInArrayZero(){
        int[] arr = {3,4,3,5,5};
        int numberToSearch = 2;
        assertEquals(0, arrayService.countNumberInArray(arr, numberToSearch));
    }

    @Test
    @DisplayName("Test is true if numberCheck count in array is same as length")
    void numberCheckCountInArrayLength(){
        int[] arr = {5,5,5,5,5};
        int numberToSearch = 5;
        assertEquals(5, arrayService.countNumberInArray(arr, numberToSearch));
    }

    @Test
    @DisplayName("Test is true if numberCheck count in array is correct")
    void numberCheckCountInArrayReturnThree(){
        int[] arr = {5,2,5,4,5};
        int numberToSearch = 5;
        assertEquals(3, arrayService.countNumberInArray(arr, numberToSearch));
    }
}
