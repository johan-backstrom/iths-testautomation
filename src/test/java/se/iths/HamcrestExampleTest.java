package se.iths;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static se.iths.StringBeginsWithLowerCaseMatcher.beginsWithLowerCase;


public class HamcrestExampleTest {

    @Test
    public void myFirstHamcrestTest(){
        String myMessage = "Apa!";

        assertThat(myMessage, is(equalTo("Apa!")));
    }

    @Test
    public void myHamcrestListTest(){

        List<String> myAnimalList = Collections.singletonList("Apa");

        assertThat(myAnimalList, hasItem("Apa"));
    }

    String myString = "bohan";

    @Test
    public void validateFirstLetterIsLowerCarse(){

        assertThat(myString, beginsWithLowerCase("b"));

    }
}
