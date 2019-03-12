package se.iths.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import se.iths.petstore.Pet;
import se.iths.petstore.PetStoreClient;

import java.util.List;

public class SillyExample {

    @Given("^I have a cucumber$")
    public void i_have_a_cucumber() throws Throwable {
        //
    }

    @When("^I eat the cucumber$")
    public void i_eat_the_cucumber() throws Throwable {

    }

    @Then("^I am full$")
    public void i_am_full() throws Throwable {

    }

    @Given("^the following objects$")
    public void the_following_objects(List<something> arg1) throws Throwable {
        arg1.forEach(
                s -> System.out.println(s)
        );
    }

    private class something{
        String apa;
        String bepa;
        int depa;

        @Override
        public String toString() {
            return "something{" +
                    "apa='" + apa + '\'' +
                    ", bepa='" + bepa + '\'' +
                    ", depa=" + depa +
                    '}';
        }
    }

    @Given("^a vehicle with brand \"([^\"]*)\", new price (\\d+), condition \"([^\"]*)\" etc\\.\\.\\.$")
    public void a_vehicle_with_brand_new_price_condition_etc(String arg1, int arg2, String arg3) throws Throwable {

    }

    @Then("^the price of the vehicle should be (\\d+)$")
    public void the_price_of_the_vehicle_should_be(int arg1) throws Throwable {

    }


    @Given("^the following pets$")
    public void the_following_pets(List<Pet> arg1) throws Throwable {
        System.out.println(arg1);
        new PetStoreClient().createPet(arg1.get(0));
    }

    @Then("^I can get the pet with id (\\d+)$")
    public void i_can_get_the_pet_with_id(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
