package se.iths.sl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leg {

    @JsonProperty("Origin")
    private JourneyDestination origin;

    @JsonProperty("Destination")
    private JourneyDestination destination;

    private String category;

    public JourneyDestination getOrigin() {
        return origin;
    }

    public void setOrigin(JourneyDestination origin) {
        this.origin = origin;
    }

    public JourneyDestination getDestination() {
        return destination;
    }

    public void setDestination(JourneyDestination destination) {
        this.destination = destination;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
