package com.DingKI.ai.mcp.server.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XxxResponse {

    @JsonProperty(value = "obsTime")
    @JsonPropertyDescription("salary")
    private String salary;

    @JsonProperty(value = "obsTime")
    @JsonPropertyDescription("working hours")
    private String dayManHour;

}

