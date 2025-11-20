package vladislavs.uhovs.lesson2.homework.sum;

public class Sum {
    public static void main(String[] args) {

        int result1 = sum1(2, 3);
        int result2 = sum1(288, 3);
        int result3 = sum1(21, 3);
        int result4 = sum1(233, 3);
        int result5 = sum1(22, 3);


        int multiply1 = multiply(result1, 123);
        int multiply2 = multiply(result2, 123);
        int multiply3 = multiply(result3, 123);
        int multiply4 = multiply(result4, 123);
        int multiply5 = multiply(result5, 123);


    }

    public static int sum1(int a, int b) {

        int result = a + b;
        System.out.println("Sum = " + a + " + " + b + " = " + result);
        return result;

    }
    public static int multiply(int a, int b){

        int multiplyResult = a * b;
        System.out.println("Multiply = " + a + " * " + b + " = " + multiplyResult);
        return multiplyResult;


    }

}