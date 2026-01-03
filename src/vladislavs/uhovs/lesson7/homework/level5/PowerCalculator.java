package vladislavs.uhovs.lesson7.homework.level5;

public class PowerCalculator {

    public int power(int number, int power){
        int result = 1;
        if (power < 0){
            throw new IllegalArgumentException("Negative exponent is not supported for int result");
        }
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }
}
