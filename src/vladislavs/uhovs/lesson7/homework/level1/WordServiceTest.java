package vladislavs.uhovs.lesson7.homework.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WordServiceTest {

    WordService wordService;

    @BeforeEach
    void setUp(){
        wordService = new WordService();
    }

    @Test
    @DisplayName("Should return hello, because it's most common word")
    void oneWordMost(){
        String expected = "hello";
        assertEquals(expected, wordService.findMostFrequentWord("Hello, it's hello world!"));
    }

    @Test
    @DisplayName("Should return hello, because hello and world occur equally often, and hello appears first in the text")
    void twoWordMost(){
        String expected = "hello";
        assertEquals(expected, wordService.findMostFrequentWord("Hello world, hello world!"));
    }

    @Test
    @DisplayName("Should return hello, because all words are the same count")
    void allWordMost(){
        String expected = "hello";
        assertEquals(expected, wordService.findMostFrequentWord("Hello world, it is my first day"));
    }

    @Test
    @DisplayName("Should return empty string, because of no words in sentence")
    void noWords(){
        String expected = "";
        assertEquals(expected, wordService.findMostFrequentWord(",.@))"));
    }

    @Test
    @DisplayName("Should return empty string when text is nul")
    void nullWord(){
        String result = wordService.findMostFrequentWord(null);
        assertEquals("", result);
    }




}
