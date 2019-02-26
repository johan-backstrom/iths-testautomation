package se.iths.petstore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
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

        HttpResponse<JsonNode> postPetResponse = Unirest
                .post("http://petstore.swagger.io/v2/pet/")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"id\": 667788,\n" +
                        "    \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"small animals\"\n" +
                        "    },\n" +
                        "    \"name\": \"Fido den 2.\",\n" +
                        "    \"photoUrls\": [\n" +
                        "        \"http://example.url\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "        {\n" +
                        "            \"id\": 0,\n" +
                        "            \"name\": \"nice pet\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"status\": \"available\"\n" +
                        "}")
                .asJson();

        Assert.assertEquals(
                200,
                postPetResponse.getStatus()
        );
    }

    @Test
    public void deletePet() throws UnirestException, InterruptedException {

        HttpResponse<JsonNode> postPetResponse = Unirest
                .post("http://petstore.swagger.io/v2/pet/")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"id\": 667788,\n" +
                        "    \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"small animals\"\n" +
                        "    },\n" +
                        "    \"name\": \"Fido den 2.\",\n" +
                        "    \"photoUrls\": [\n" +
                        "        \"http://example.url\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "        {\n" +
                        "            \"id\": 0,\n" +
                        "            \"name\": \"nice pet\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"status\": \"available\"\n" +
                        "}")
                .asJson();

        Assert.assertEquals(
                200,
                postPetResponse.getStatus()
        );

        HttpResponse<JsonNode> getPetResponse = Unirest
                .get("http://petstore.swagger.io/v2/pet/667788")
                .asJson();

        Assert.assertEquals(
                200,
                getPetResponse.getStatus()
        );

        Assert.assertEquals(
                "Fido den 2.",
                getPetResponse.getBody().getObject().getString("name")
        );

        HttpResponse<String> deleteRsponse = Unirest.delete("http://petstore.swagger.io/v2/pet/667788").asString();

        Assert.assertEquals(
                200,
                deleteRsponse.getStatus()
        );

        HttpResponse<JsonNode> getDeletedPetResponse = Unirest
                .get("http://petstore.swagger.io/v2/pet/667788")
                .asJson();

        Assert.assertEquals(
                404,
                getDeletedPetResponse.getStatus()
        );
    }

}
