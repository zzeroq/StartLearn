package vladislavs.uhovs.lesson6.lesson.slotMachine;

public class Slot {

    int balance = 0;
    SlotPrompter slotPrompter;
    SlotCarousel slotCarousel;

    public Slot(int balance, SlotPrompter slotPrompter, SlotCarousel slotCarousel) {
        this.balance = balance;
        this.slotPrompter = slotPrompter;
        this.slotCarousel = slotCarousel;
    }

    void play() {

        while (true) {

            if (balance <= 0) {
                System.out.println("💰 You out of cash $ 💰");

                if (slotPrompter.wantDeposit()) {
                    deposit();
                }else {
                    System.out.println("😔 See you soon 😔");
                    break;
                }
            }

            System.out.println("Current balance: " + balance + "$");

            if (!slotPrompter.playNextGame()) {
                System.out.println("😔 See you soon 😔");
                break;
            }
            slotCarousel.spin();
            slotCarousel.display();

            if (slotCarousel.won()) {
                System.out.println("💰 You won! 💰");
                balance += 500;
            } else {
                System.out.println("😔 Better luck next time! 😔");
                System.out.println();
                balance -= 50;
            }

        }
        System.out.println();
    }

    void deposit() {
        this.balance += slotPrompter.promptDepositAmount();
    }
}
