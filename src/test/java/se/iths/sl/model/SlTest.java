package se.iths.sl.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SlTest {

    @Test
    public void callPlanner() throws UnirestException {

        HttpResponse<Response> response = Unirest
                .get("https://api.sl.se/api2/TravelplannerV3_1/trip.json?originId=9294&destId=9202&time=12%3A00&key=d87898db7524460796aeab149387fdd6&date=2019-05-06")
                .asObject(Response.class);

        assertEquals(
                "12:02:00",
                response.getBody().getTrip().get(0).getLegList().getLegList().get(0).getOrigin().getTime()
        );
    }

















    @BeforeClass
    public static void setupJackson(){
        Unirest.setObjectMapper(new ObjectMapper() {
            @Override
            public <T> T readValue(String s, Class<T> aClass) {
                try {
                    return new com.fasterxml.jackson.databind.ObjectMapper().readValue(s, aClass);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public String writeValue(Object o) {
                try {
                    return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(o);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
