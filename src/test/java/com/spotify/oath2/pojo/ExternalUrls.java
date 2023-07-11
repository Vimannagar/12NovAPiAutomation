
package com.spotify.oath2.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class ExternalUrls {

    
    private String spotify;

  
    public String getSpotify() {
        return spotify;
    }

   
    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

}
