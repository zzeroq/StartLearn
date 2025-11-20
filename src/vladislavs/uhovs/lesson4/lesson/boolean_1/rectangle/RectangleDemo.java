package vladislavs.uhovs.lesson4.lesson.boolean_1.rectangle;

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 13);
        rectangle.print();

        if (rectangle.isSquare()) {
            System.out.println("This rectangle is square shaped");
        } else {
            System.out.println("This rectangle is regular rectangle");
        }

    }

}
