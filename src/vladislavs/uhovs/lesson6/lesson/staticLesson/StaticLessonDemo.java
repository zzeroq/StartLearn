package vladislavs.uhovs.lesson6.lesson.staticLesson;

public class StaticLessonDemo {
    public static void main(String[] args) {

        StaticLesson message1 = new StaticLesson("Hello");
        message1.print();
        StaticLesson message2 = new StaticLesson("world");
        message2.print();
        StaticLesson message3 = new StaticLesson("today");
        message3.print();

        StaticLesson.instanceCount++;
        message1.print();


    }
}
