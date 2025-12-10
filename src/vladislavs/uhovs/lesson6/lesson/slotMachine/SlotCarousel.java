package vladislavs.uhovs.lesson6.lesson.slotMachine;

import java.util.Random;

public class SlotCarousel {

    static String[] images = {"💵", "🍇", "🍉", "🍊", "🍋", "🍌", "🍍", "🍒", "🍎"};

    String[] bars;

    Random random;

    public SlotCarousel(Random random, int length) {
        this.random = random;
        this.bars = new String[length];
    }

    void spin() {
        for (int i = 0; i < bars.length; i++) {
            bars[i] = randomImage();
        }
    }

    void display() {
        System.out.print(">> ");
        for (String bar : bars) {
            System.out.print(bar);
        }
        System.out.println(" <<");
    }

    boolean won() {
        for (int i = 1; i < bars.length; i++) {
            if (!bars[0].equals(bars[i])) {
                return false;
            }
        }
        return true;
    }

    String randomImage() {
        return images[random.nextInt(images.length)];
    }
}
