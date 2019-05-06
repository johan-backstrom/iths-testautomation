package se.iths.sl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trip {

    @JsonProperty("ServiceDays")
    private List<Object> serviceDays;

    @JsonProperty("LegList")
    private LegList legList;

    public List<Object> getServiceDays() {
        return serviceDays;
    }

    public void setServiceDays(List<Object> serviceDays) {
        this.serviceDays = serviceDays;
    }

    public LegList getLegList() {
        return legList;
    }

    public void setLegList(LegList legList) {
        this.legList = legList;
    }
}
