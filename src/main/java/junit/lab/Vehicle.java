package junit.lab;

public class Vehicle {

    private String make;
    private int yearOfManufacturing;
    private int newPrice;
    private Condition condition;

    public Vehicle(String make, int yearOfManufacturing, int newPrice, Condition condition){
        this.make = make;
        this.condition = condition;
        this.newPrice = newPrice;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public int calculatePrice(){

        // First requirement
        int price = newPrice * 9 / 10;

        // Second requirement
        double reduction = Math.pow(
                (double)8/10,
                2019 - yearOfManufacturing
        );
        price = (int)(price * reduction);

        // Third requirement


        // Finished
        return price;
    }

    public enum Condition{
        mint,
        used,
        crap
    }
}
