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

    public int calculateVehicleValue(){
        return 0;
    }

    public enum Condition{
        mint,
        used,
        crap
    }
}
