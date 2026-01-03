package vladislavs.uhovs.lesson7.homework.level6.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    @DisplayName("Should return true if text is palindrome")
    public void textIsPalindromeTrue(){
        assertTrue(palindrome.ifTextIsPalindrome("level"));
    }

    @Test
    @DisplayName("Should return false if text is not palindrome with high register")
    public void textIsPalindromeFalse(){
        assertFalse(palindrome.ifTextIsPalindrome("Level"));
    }

    @Test
    @DisplayName("Should return true if text is null")
    public void textIsPalindromeNull(){
        assertTrue(palindrome.ifTextIsPalindrome(""));
    }

    @Test
    @DisplayName("Should return false if text is not palindrome")
    void notPalindrome(){
        assertFalse(palindrome.ifTextIsPalindrome("hello"));
    }

    @Test
    @DisplayName("Should return true when text is palindrome with spaces")
    void palindromeWithSpaces(){
        assertTrue(palindrome.ifTextIsPalindrome("taco cat "));
    }

    @Test
    @DisplayName("Should return true when text is one character")
    void singleCharacter(){
        assertTrue(palindrome.ifTextIsPalindrome("a"));
    }

    @Test
    @DisplayName("Should return true when text odd length and is palindrome")
    void oddLengthPalindrome(){
        assertTrue(palindrome.ifTextIsPalindrome("racecar"));
    }
}
