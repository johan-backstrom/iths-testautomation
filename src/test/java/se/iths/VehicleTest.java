package se.iths;

import junit.lab.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void carIsWorth90PercentOfNewPrice() {

        Vehicle myVehicle = new Vehicle(
                "Volvo",
                2019,
                100000,
                Vehicle.Condition.mint
        );

        Assert.assertEquals(
                90000,
                myVehicle.calculatePrice()
        );
    }

    @Test
    public void carDecreases20percentInValueEachYear() {

        Vehicle myVehicle = new Vehicle(
                "Volvo",
                2018,
                100000,
                Vehicle.Condition.mint
        );

        Assert.assertEquals(
                72000,
                myVehicle.calculatePrice()
        );
    }

    @Test
    public void carDecreases20percentInValueEachYearWithTwoYears() {

        Vehicle myVehicle = new Vehicle(
                "Volvo",
                2017,
                100000,
                Vehicle.Condition.mint
        );

        Assert.assertEquals(
                57600,
                myVehicle.calculatePrice()
        );

    }

}
