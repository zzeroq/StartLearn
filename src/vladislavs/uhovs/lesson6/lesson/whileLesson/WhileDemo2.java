package vladislavs.uhovs.lesson6.lesson.whileLesson;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class WhileDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        LocalDateTime deadLine = LocalDateTime.now().plusSeconds(10);
        LocalDateTime current = LocalDateTime.now();

        while (current.isBefore(deadLine)){
            System.out.println(LocalDateTime.now());
            TimeUnit.SECONDS.sleep(1);
            current = LocalDateTime.now();
        }
        System.out.println("Finish");
    }
}
