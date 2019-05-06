package se.iths.sl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LegList {

    @JsonProperty("Leg")
    private List<Leg> legList;

    public List<Leg> getLegList() {
        return legList;
    }

    public void setLegList(List<Leg> legList) {
        this.legList = legList;
    }
}
