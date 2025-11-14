package vladislavs_uhovs.lesson3.checkMyself;

public class numbers {

    public static void modify(int x) {
        x = x + 100;           // x = 150
        System.out.println(x);  // prints 150
    }

    public static void main(String[] args) {
        int num = 50;
        modify(num);           // What happens here?
        System.out.println(num); // What prints?
    }
}
