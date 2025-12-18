package vladislavs.uhovs.lesson6.homework.level4.task20;

public class WhileLoopContinue {
    public void infinityLoopWhile(){
        int i =0;
        while (true){
            i++;
            if (i == 2){
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
