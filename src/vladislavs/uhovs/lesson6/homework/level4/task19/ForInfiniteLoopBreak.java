package vladislavs.uhovs.lesson6.homework.level4.task19;

public class ForInfiniteLoopBreak {
    public void infinityLoopFor(){
        int i = 0;
        for (; ; ) {
            System.out.println("Ok");
            i++;
            if (i == 2) {
                break;
            }
        }
    }
}
