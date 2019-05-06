package se.iths.sl2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class LinesAndStationsClient {

    String apiKey = "ac1acfc9bea3467d89133a825d7abad7";

    public String getSiteIdForStation(String station) {

        try {
            HttpResponse<String> response = Unirest.get("https://api.sl.se/api2/LineData.json")
                    .queryString("model", "site")
                    .queryString("key", apiKey)
                    .asString();

            SiteResponse siteResponse = new ObjectMapper().readValue(
                    response.getBody(),
                    SiteResponse.class
            );

            for(Site site : siteResponse.getResponseData().getResult()){
                if(site.getSiteName().equals(station)){
                    return site.getSiteId();
                }
            }
            
            throw new RuntimeException("Site not found");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
