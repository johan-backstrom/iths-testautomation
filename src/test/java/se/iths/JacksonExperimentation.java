package se.iths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.lab.atm.BankCard;
import org.junit.Test;
import se.iths.petstore.Pet;

import java.util.Collections;

public class JacksonExperimentation {

    @Test
    public void simpleSerialization() throws JsonProcessingException {

        BankCard myCard = new BankCard(
                "APA",
                2020,
                12
        );

        ObjectMapper mapper = new ObjectMapper();
        String myCardAsJson = mapper.writeValueAsString(myCard);

        System.out.println(myCardAsJson);
    }

    @Test
    public void serializePet() throws JsonProcessingException {
        Pet fido = new Pet(
                123457,
                "Fido II",
                Collections.emptyList(),
                "available"
        );

        ObjectMapper mapper = new ObjectMapper();
        String fidoAsJson = mapper.writeValueAsString(fido);
        System.out.println(fidoAsJson);
    }

}
