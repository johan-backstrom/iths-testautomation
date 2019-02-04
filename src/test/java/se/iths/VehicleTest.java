package se.iths;

import junit.lab.Vehicle;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class VehicleTest {

    @Test
    public void calculatePrice() {
        assertThat(
                new Vehicle(
                        "Volvo",
                        2017,
                        10000,
                        Vehicle.Condition.crap
                ).calculateVehicleValue(),
                CoreMatchers.is(0)
        );
    }
}
