package se.iths.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import se.iths.petstore.Pet;
import se.iths.petstore.PetStoreClient;

import java.util.Collections;
import java.util.List;

public class PetStore {

    @Given("^a pet with id (\\d+)$")
    public void a_pet_with_id(Integer petId) throws Throwable {

        Pet myPet = new Pet(
                petId,
                "Kjell",
                Collections.emptyList(),
                "available"
        );

        new PetStoreClient().createPet(myPet);
    }

    @When("^I delete the pet with id (\\d+)$")
    public void i_delete_the_pet_with_id(int petId) throws Throwable {

        new PetStoreClient().deletePet(petId);

        List<Pet> myPets = new PetStoreClient()
                .getPetsByStatus("pending");

        CucumberHooks
                .getWorld()
                .setPetresponseList(myPets);

    }

    @Then("^I get an error fetching the pet with id (\\d+)$")
    public void i_get_an_error_fetching_the_pet_with_id(int arg1) throws Throwable {
        new PetStoreClient().getPet(arg1, 404);

        System.out.println(CucumberHooks.getWorld().petresponseList.get(0));
    }
}
