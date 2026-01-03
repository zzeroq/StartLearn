package vladislavs.uhovs.lesson7.homework.level6.task9;

import java.util.Arrays;

public class Palindrome {

    public char[] palindromeText(String text){
        return text.toCharArray();
    }

    public char[] textReverse(String text){
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = chars[chars.length - i - 1];
        }
        return reversed;
    }

    public boolean ifTextIsPalindrome(String text){
        text = text.replaceAll("\\s+", "");
        return Arrays.equals(palindromeText(text), textReverse(text));
    }

}
