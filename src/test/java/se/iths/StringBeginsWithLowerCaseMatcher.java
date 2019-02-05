package se.iths;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class StringBeginsWithLowerCaseMatcher extends TypeSafeMatcher<String> {

    String startLetter;

    public static StringBeginsWithLowerCaseMatcher beginsWithLowerCase(String startLetter){
        return new StringBeginsWithLowerCaseMatcher(startLetter);
    }

    public StringBeginsWithLowerCaseMatcher(String startLetter){
        this.startLetter = startLetter;
    }


    @Override
    protected boolean matchesSafely(String s) {
        return s.substring(0,1).toLowerCase().equals(s.substring(0,1))
                && startLetter.equals(s.substring(0,1));
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Expected a string starting with a lower case letter");
    }
}
