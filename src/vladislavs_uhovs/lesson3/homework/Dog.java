package vladislavs_uhovs.lesson3.homework;

public class Dog {

    private final String nickName;

    Dog(String nickName){
        this.nickName=nickName;

    }
    String getNickName() {
        return this.nickName;
    }

    public void voice() {

        // all in 1 line
        System.out.println(nickName + " " + nickName + " " + nickName);
        // each name on the separate line
        System.out.println(nickName);
        System.out.println(nickName);
        System.out.println(nickName);

    }


}
