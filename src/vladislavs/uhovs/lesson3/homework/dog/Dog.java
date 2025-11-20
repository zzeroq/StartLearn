package vladislavs.uhovs.lesson3.homework.dog;

public class Dog {

    private final String nickName;
    int age;
    String color;


    Dog(String nickName, String color){
        this.nickName=nickName;
        this.color=color;



    }
    String getNickName() {

        return this.nickName;
    }
    int getAge() {

        return this.age;
    }

    public void voice() {
        if (age == 0) {
            // all in 1 line
            System.out.println(nickName + " " + nickName + " " + nickName);
            System.out.println();
            // each name on the separate line
            System.out.println(nickName);
            System.out.println(nickName);
            System.out.println(nickName);
        }else {

            System.out.println(nickName + " " + getAge() + " years" + " color " + color);

        }

    }
    public void setAge(int age){
            this.age=age;
    }
    void happyBirthday() {

            age++;
            System.out.println("Happy Birthday!!\n" +
                    "Now your age is " + getAge() + " years old");
    }
    void changeColor(String color){

        this.color=color;


    }

}
