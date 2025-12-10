package vladislavs.uhovs.lesson6.lesson.staticLesson;

public class StaticLesson {

    static int instanceCount = 0;
    String text;

    public StaticLesson(String text){
        this.text = text;
        instanceCount++;
    }

    void print(){
        System.out.println("MessageText = " + text + ", instancesCount = " + instanceCount);
    }

}
