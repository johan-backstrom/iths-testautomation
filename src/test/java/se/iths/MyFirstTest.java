package se.iths;

import junit.lab.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFirstTest {

    Calculator myCalculator = new Calculator();

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
        Assert.assertEquals(
                -200,
                myCalculator.percent(50, -25),
                0
        );
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

    @Test
    public void divisionByZero(){

        try {
            myCalculator.divide(100, 0);
        } catch (ArithmeticException e){
            return;
        }

        Assert.fail();
    }

    @Test
    public void divisionByNegative(){
        Assert.assertEquals(
                -2,
                myCalculator.divide(4, -2)
        );
    }
}
