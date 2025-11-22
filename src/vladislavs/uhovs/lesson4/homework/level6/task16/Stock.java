package vladislavs.uhovs.lesson4.homework.level6.task16;

public class Stock {

   private final String companyName;
   private int priceNow;
   private int priceMin;
   private int priceMax ;

    Stock(String companyName, int startPrice){
        this.companyName = companyName;
        this.priceNow    = startPrice;
        this.priceMin    = startPrice;
        this.priceMax    = startPrice;

    }
    public String getCompanyName(){ return this.companyName; }
    public int getPriceNow(){ return this.priceNow; }
    public int getPriceMin(){ return priceMin; }
    public int getPriceMax(){ return priceMax; }

    public void updatePrice(int newPrice){
        this.priceNow = newPrice;
        if (newPrice  < priceMin){
            priceMin = newPrice;
        }
        if (newPrice  > priceMax){
            priceMax = newPrice;
        }

    }
    public String getPriceInformation(){
        return ("Company name: " + getCompanyName() + "\nStock current price: " + getPriceNow() + "\nStock minimum price: " + priceMin + "\nStock max price: " + priceMax);
    }


}
