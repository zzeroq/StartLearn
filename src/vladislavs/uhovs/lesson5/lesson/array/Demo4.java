package vladislavs.uhovs.lesson5.lesson.array;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {

        String text = "Quick brown fox jumped over the lazy dog";
        String[] words = text.split(" ");
        words[2] = "pig";

        System.out.println("text = " + text);
        System.out.println("words = " + Arrays.toString(words));
        System.out.println("Sentence contains " + words.length + " words");

    }
}
