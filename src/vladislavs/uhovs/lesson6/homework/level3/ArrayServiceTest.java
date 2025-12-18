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

    @Test
    @DisplayName("Test is true if first found number to replace in array is replaced")
    void replaceNumberToNewNumberIsTrue(){
        int[] arr = {3,4,5,6,7};
        int numberToReplace = 4;
        int newNumber = 9;
        assertTrue(arrayService.replaceArrayFirstNumber(arr, numberToReplace, newNumber));
        assertEquals(newNumber, arr[1]);
    }

    @Test
    @DisplayName("Test is false if first found number to replace in array is not found")
    void replaceNumberToNewNumberIsFalse(){
        int[] arr = {3,5,5,6,7};
        int numberToReplace = 4;
        int newNumber = 9;
        int[] expected = {3,5,5,6,7};
        assertFalse(arrayService.replaceArrayFirstNumber(arr, numberToReplace, newNumber));
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should replace all matching numbers in array and return count replacement")
    void replaceSameNumbersToNewNumberIsTrue(){
        int[] arr = {3,4,5,4,4};
        int numberToReplace = 4;
        int newNumber = 9;
        int[] expected = {3,9,5,9,9};
        int count = 3;
        assertEquals(count, arrayService.replaceArrayNumbers(arr, numberToReplace, newNumber));
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change array when number is not found")
    void replaceSameNumbersToNewNumberIsFalse(){
        int[] arr = {3,7,5,7,7};
        int numberToReplace = 4;
        int newNumber = 9;
        int[] expected = {3,7,5,7,7};
        assertEquals(0 ,arrayService.replaceArrayNumbers(arr, numberToReplace, newNumber));
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should reverse array's odd count elements")
    void reverseArrayOddCountElements(){
        int[] arr = {2,3,4,5,6};
        int[] expected = {6,5,4,3,2};
        arrayService.reverse(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should reverse array's even count elements")
    void reverseArrayEvenCountElements(){
        int[] arr = {2,3,4,5,6,7};
        int[] expected = {7,6,5,4,3,2};
        arrayService.reverse(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change array with 1 element")
    void changeNotArrayOneElement(){
        int[] arr = {2};
        int[] expected = {2};
        arrayService.reverse(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change array with zero elements")
    void changeNotArrayZeroElements(){
        int[] arr = {};
        int[] expected = {};
        arrayService.reverse(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should sort array from min to max element")
    void sortArrayFromMinToMax(){
        int[] arr = {5,3,4,7,6};
        int[] expected = {3,4,5,6,7};
        arrayService.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should sort array from min to max with same element")
    void sortArraySameElementsFromMinToMax(){
        int[] arr = {4,3,4,7,4};
        int[] expected = {3,4,4,4,7};
        arrayService.sort(arr);
        assertArrayEquals(expected, arr);
    }


    @Test
    @DisplayName("Should not change anything in array with one element")
    void sortNotArrayOneElement(){
        int[] arr = {5};
        int[] expected = {5};
        arrayService.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change anything in array with zero elements")
    void sortNotArrayZeroElement(){
        int[] arr = {};
        int[] expected = {};
        arrayService.sort(arr);
        assertArrayEquals(expected, arr);
    }





















}
