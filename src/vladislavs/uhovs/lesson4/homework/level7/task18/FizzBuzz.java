package vladislavs.uhovs.lesson4.homework.level7.task18;

public class FizzBuzz {
    public String detect(int inNumber){

        if (inNumber % 15 == 0){
            return "FizzBuzz";
        }else if (inNumber % 3 == 0){
            return "Fizz";
        } else if (inNumber % 5 == 0) {
            return "Buzz";
        }else {
            return "" + inNumber;

        }
    }
}
