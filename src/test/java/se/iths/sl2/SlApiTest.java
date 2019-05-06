package se.iths.sl2;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlApiTest {


    @Test
    public void getLiljeholmenSiteId() throws UnirestException {

        String liljholmenSiteId = new LinesAndStationsClient()
                .getSiteIdForStation("Liljeholmen");

        assertEquals("9294", liljholmenSiteId);
    }

}
