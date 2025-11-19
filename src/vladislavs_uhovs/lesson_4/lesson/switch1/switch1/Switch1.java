package vladislavs_uhovs.lesson_4.lesson.switch1.switch1;

public class Switch1 {

    public static void main(String[] args) {


        String today = "tuesday";

        switch (today){
            case "monday":
                System.out.println("Oh no... ");
                break;
            case "tuesday":
                System.out.println("better than monday... ");
                break;
            case "wednesday":
                System.out.println("java time ");
                break;
            case "thursday":
                System.out.println("small friday");
                break;
            case "friday":
                System.out.println("Chilling ");
                break;
            case "sunday":
                System.out.println("Oh yeah!");
                break;

        }
        switch (today){
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                System.out.println("work day! ");
                break;
            case "sunday":
                System.out.println("off day!"); // or weekend
                break;
        }




    }


}
