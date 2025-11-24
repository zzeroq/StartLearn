package vladislavs.uhovs.lesson4.homework.level4.tasks10to14;

class Calculator {

    public int sum (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int subtract (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public int divide (int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public int multiply (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
        // return number % 2 == 0; - simplified!
    }
    public int compareNumbers(int number1, int number2){
        if (number1 > number2){
            return number1;
        } else {
            return number2;
        }

    }
    public int biggestNumber(int number1, int number2, int number3){
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
