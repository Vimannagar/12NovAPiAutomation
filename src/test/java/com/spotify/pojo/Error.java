
package com.spotify.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class Error {

    @JsonProperty("error")
    private Error__1 error;

    @JsonProperty("error")
    public Error__1 getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Error__1 error) {
        this.error = error;
    }

}
