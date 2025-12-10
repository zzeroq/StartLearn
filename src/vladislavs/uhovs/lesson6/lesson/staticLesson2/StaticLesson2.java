package vladislavs.uhovs.lesson6.lesson.staticLesson2;

public class StaticLesson2 {

    int leftBound;
    int rightBound;

    public StaticLesson2(int rightBound, int leftBound) {
        this.rightBound = rightBound;
        this.leftBound = leftBound;
    }

    static StaticLesson2 offLeft(int leftBound){
        return new StaticLesson2(leftBound,Integer.MAX_VALUE);
    }
    static StaticLesson2 offRight(int rightBound){
        return new StaticLesson2(Integer.MIN_VALUE,rightBound);
    }

    String asString(){
        return "Range(lefBound = " + leftBound + " rightBound = " + rightBound + ")";
    }


}
