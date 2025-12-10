package vladislavs.uhovs.lesson6.lesson.staticLesson2;

public class StaticLesson2Demo {
    public static void main(String[] args) {

        StaticLesson2 staticLesson2 = new StaticLesson2(20,30);

        StaticLesson2 left = StaticLesson2.offLeft(30);
        StaticLesson2 right = StaticLesson2.offRight(120);

        System.out.println("range.asString() = " + staticLesson2.asString());
        System.out.println("range.asString() = " + left.asString());
        System.out.println("range.asString() = " + right.asString());

    }
}
