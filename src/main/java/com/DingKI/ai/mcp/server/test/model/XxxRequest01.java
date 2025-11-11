package com.DingKI.ai.mcp.server.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XxxRequest01 {

    @JsonProperty(required = true, value = "city")
    @JsonPropertyDescription("city")
    private String city;

    @JsonProperty(required = true, value = "company")
    @JsonPropertyDescription("company name")
    private Company company;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Company {

        @JsonProperty(required = true, value = "name")
        @JsonPropertyDescription("company")
        private String name;

        @JsonProperty(required = true, value = "type")
        @JsonPropertyDescription("company type")
        private String type;
    }

}

