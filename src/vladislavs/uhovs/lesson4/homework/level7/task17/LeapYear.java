package vladislavs.uhovs.lesson4.homework.level7.task17;

public class LeapYear {


    public boolean isLeapYear(int year){

        if       (year % 400 == 0){
            return true;
        }else if (year % 100 == 0){
            return false;
        }else if (year % 4  == 0){
            return true;
        }else {
            return false;
        }

    }


}
