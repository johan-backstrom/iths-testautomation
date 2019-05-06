package se.iths.sl2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseData {

    @JsonProperty("Version")
    private String version;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Result")
    private List<Site> result;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Site> getResult() {
        return result;
    }

    public void setResult(List<Site> result) {
        this.result = result;
    }
}
