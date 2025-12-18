package vladislavs.uhovs.lesson6.homework.level4.task20;

public class ForLoopContinue {
    public void infinityLoopFor(){
        int i = 0;
        for (; ; ) {
            i++;
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
