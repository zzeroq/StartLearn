package vladislavs.uhovs.lesson6.homework.level4.task19;

public class WhileInfiniteLoopBreak {
    public void infinityLoopWhile(){
        int i =0;
        while (true){
            System.out.println("Ok");
            i++;
            if (i == 2) {
                break;
            }
        }
    }
}
