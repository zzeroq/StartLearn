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

    public void sizeCheck(){

      System.out.println(size);

    }

    public void colorCheck(){

        System.out.println(color);

    }
    public void changeSize(String size){

        this.size=size;

    }
    public void checkGram(){

        System.out.println(gram);

    }
    public void changeGram(int gram){


        gram++;
        gram++;
        gram+=3;
        this.gram=gram;

    }



}
