package junit.homwork;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtility {

    public String camelCase(String scentence){
        double inverseLength = 1/scentence.length();
        return Arrays.stream(scentence.split("\\s+"))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1, s.length()))
                .collect(Collectors.joining());
    }

    public String reverse(String original)
    {
        String reverse = "";
        int length = original.trim().length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
        {
            reverse = reverse + original.charAt(i);
        }
        return reverse.toLowerCase();

    }

    public boolean isValidEmailAddress(String email){
        return email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    }
}
