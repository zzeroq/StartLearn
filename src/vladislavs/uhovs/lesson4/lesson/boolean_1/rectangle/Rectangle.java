package vladislavs.uhovs.lesson4.lesson.boolean_1.rectangle;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int perimeter() {
        return (width + height) * 2;
    }

    int area() {
        return width * height;
    }

    boolean isSquare() {
        /*
            if (width == height) {
                return true;
            } else {
                return false;
            }
        */

        return width == height;
    }

    void print() {
        System.out.println("-= Rectangle =-");
        System.out.println("Width      = " + width);
        System.out.println("Height     = " + height);
        System.out.println("Perimeter  = " + perimeter());
        System.out.println("Area       = " + area());
        System.out.println("isSquare() = " + isSquare());
        System.out.println();
    }
}

