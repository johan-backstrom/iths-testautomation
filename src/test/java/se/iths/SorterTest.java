package se.iths;

import junit.lab.sorter.Sorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {

    @Test
    public void sorterTest(){

        int[] unsortedIntegers = {100, -100, 1, 0};
        int[] expectedSorting = {-100, 0, 1, 100};

        int[] sortedIntegers = new Sorter().sort(unsortedIntegers);
        Assert.assertArrayEquals(expectedSorting, sortedIntegers);
    }

    @Test
    public void onlyEvenTest(){

        int[] oddAndEven = {1, 2, 3, 4};
        int[] expectedEven = {2, 4};

        Assert.assertArrayEquals(
                expectedEven,
                new Sorter().onlyEven(oddAndEven)
        );

    }
}
