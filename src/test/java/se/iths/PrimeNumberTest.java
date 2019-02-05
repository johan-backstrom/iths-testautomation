package se.iths;

import junit.lab.PrimeNumberLab;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeNumberTest {

    @Test
    public void simplePrimeTest(){

        List<Integer> primes = new PrimeNumberLab().getPrimeNumbersBetween(10, 12);

        assertThat(
                primes.get(0),
                is(11)
        );
    }
}
