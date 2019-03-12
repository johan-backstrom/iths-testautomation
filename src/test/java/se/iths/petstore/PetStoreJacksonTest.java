package se.iths.petstore;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class PetStoreJacksonTest {

    PetStoreClient client = new PetStoreClient();

    @Test
    public void getPet() throws UnirestException, IOException {

        Pet fido = new Pet(
                123457,
                "Fido II",
                Collections.emptyList(),
                "available"
        );

        client.createPet(fido);

        Pet myPetAgain = client.getPet(123457);

        Assert.assertEquals(
                "Fido II",
                myPetAgain.getName()
        );
    }

    @Test
    public void createNewPet() throws UnirestException {

        Pet newPet = new Pet(123456, "Fido", Collections.EMPTY_LIST, "available");
        client.createPet(newPet);
    }

    @Test
    public void deletePet() throws UnirestException, InterruptedException {


        Pet newPet = new Pet(123456, "Fido", Collections.EMPTY_LIST, "available");
        client.createPet(newPet);

        Assert.assertEquals(
                "Fido",
                client.getPet(123456).getName()
        );
        ;


        client.deletePet(123456);

        client.getPet(123456, 404);
    }

    @Test
    public void logInWithCorrectCredentials() {

        User user = new User(
                123456,
                "my-user",
                "johan",
                "baxter",
                "apa@test.com",
                "pass",
                "0701234567",
                0
        );
        client.createUser(user);

        Assert.assertTrue(
                client.logIn("my-user", "pass")
        );
    }
}
