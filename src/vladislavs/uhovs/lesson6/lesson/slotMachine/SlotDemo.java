package vladislavs.uhovs.lesson6.lesson.slotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotDemo {
    public static void main(String[] args) {

        SlotPrompter slotPrompter = new SlotPrompter(new Scanner(System.in));
        SlotCarousel slotCarousel = new SlotCarousel(new Random(),3);

        Slot slot = new Slot(0, slotPrompter, slotCarousel);
        slot.play();
    }
}
