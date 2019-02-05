package se.iths;

import junit.lab.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MyFirstTest {

    Calculator myCalculator;

    @Before
    public void setUp() {
        System.out.println("Creating new calculator...");
        myCalculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Do some cleanup...");
    }

    @Test(expected = RuntimeException.class)
    public void testException() throws Exception {
        throw new RuntimeException("Apa!");
    }

    @Test
    public void addPositiveNumbers() {

        int additionResult = myCalculator.add(1, 2);
        Assert.assertEquals(3, additionResult);
    }

    @Test
    public void addNegativeNumbers() {

        int additionResult = myCalculator.add(-100, -2);
        Assert.assertEquals(-102, additionResult);
    }

    @Test
    public void subtractTwoNumbers() {
        Assert.assertEquals(
                50,
                myCalculator.subtract(100, 50)
        );
    }

    @Test
    public void percentageOfPositiveNumber() {
        Assert.assertEquals(
                200,
                myCalculator.percent(50, 25),
                0
        );
    }

    @Test
    public void percentageOfNegativeNumber() {

        assertThat(myCalculator.percent(50,-25), is(-200));
    }

    @Test
    public void percentageOfZero() {

        boolean isInfinite = Double.isInfinite(
                myCalculator.percent(50, 0)
        );

        Assert.assertTrue(
                isInfinite
        );
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {

        myCalculator.divide(100, 0);

    }

    @Test
    public void divisionByNegative() {
        assertThat(myCalculator.divide(4, -2), is(-2));
    }
}
