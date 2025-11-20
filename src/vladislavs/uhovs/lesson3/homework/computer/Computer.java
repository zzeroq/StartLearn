package vladislavs.uhovs.lesson3.homework.computer;

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
    public String getModel(){
        return this.model;
    }

}
