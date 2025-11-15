package vladislavs_uhovs.lesson_1;
/* Primitive value

Integer: byte,short,int,long (-128...127, -32768...32767, -2^31...2^31-1, -2^63...2^63-1)
float(4 bytes), double(8 bytes): (double numbers like 10.05)
boolean: true/false
char: all symbols


 */
public class DataTypePrimitive {

    public static void main(String[] args) {

       /*
        byte b = 127;
        short s = 32000;
        int num = 2_140_000_000; int y = s;
        num = 222222;
        long large = 3339999999999999999L;// the biggest number, need L

        double num1 = 122.3;
        float num2 = 3.4f;// f needs
        char symbols = 'a';

        boolean cap = true; // or false
        Dog dog = new Dog("Hercules");  "Hercules" - это аргумент конструктора
        dog.setAge(5); 5 - это аргумент метода setAge
        */
        int a = 25;
        int c = 10;
        int result = a % c;

        System.out.println(a + " % " + c + " = " + result);
        boolean ac = true;
        System.out.println(ac);

    }

}
