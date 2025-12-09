package vladislavs.uhovs.lesson5.selfCheck.level;

public class Robot {

    private String color;
    private String model;
    private int weight;
    private int cost;

    public Robot(String color, String model, int weight, int cost){
        this.color = color;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
    }

    public String getColor(){
        return this.color;
    }
    public String getModel(){
        return this.model;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getCost(){
        return this.cost;
    }

    public void changeColor(String color){
        this.color = color;
    }
    public void changeModel(String model){
        this.model = model;
    }
    public void changeWeight(int weight){
        this.weight = weight;
    }
    public void changeCost(int cost){
        this.cost = cost;
    }
}
