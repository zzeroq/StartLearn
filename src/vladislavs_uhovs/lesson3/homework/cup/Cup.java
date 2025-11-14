package vladislavs_uhovs.lesson3.homework.cup;

public class Cup {

    private String color;
    private int gram;
    private String size;

    Cup(String color, int gram, String size){
        this.gram=gram;
        this.color=color;
        this.size=size;
    }

    public int getGram(){
        return this.gram;
    }

    public String getColor(){
        return this.color;
    }

    public String getSize(){
        return this.size;
    }

    public void checkCup(){
        System.out.println("Cup size: " + size);
        System.out.println("Cup color: " + color);
        System.out.println("Cup gram: " + gram);
    }

    public void changeSize(String size){
        this.size=size;
    }

    public void addGram(int gram){
        // practise
        gram++;  // +1
        gram++;  // +1
        gram+=3; // +3
        this.gram+=gram; // + any number in different void
        // this.gram-=gram; - any number in different void
    }
    public void removeGram(int gram){
        // practise
        this.gram-=gram; // - any number in different void
    }


}
