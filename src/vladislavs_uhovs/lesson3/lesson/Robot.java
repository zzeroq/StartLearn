package vladislavs_uhovs.lesson3.lesson;

public class Robot {

    String nickName;

    Robot(String nickName) {

        this.nickName = nickName;


    }

    public void sayHello() {
        try {


            System.out.println("Hello! ...bip");
            Thread.sleep(500);
            System.out.println("Bzzz ...bip");
            Thread.sleep(1500);
            System.out.println("My name... bzzz..." + nickName);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void changeNickName(String newNickName) {
        this.nickName = newNickName;
    }
}











