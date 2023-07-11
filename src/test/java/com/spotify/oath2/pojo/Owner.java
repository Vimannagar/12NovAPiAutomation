
package com.spotify.oath2.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class Owner {

   
    private String displayName;
   
    private ExternalUrls__1 externalUrls;
 
    private String href;
   
    private String id;
  
    private String type;
    
    private String uri;

   
    public String getDisplayName() {
        return displayName;
    }

    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    
    public ExternalUrls__1 getExternalUrls() {
        return externalUrls;
    }

    
    public void setExternalUrls(ExternalUrls__1 externalUrls) {
        this.externalUrls = externalUrls;
    }

   
    public String getHref() {
        return href;
    }

   
    public void setHref(String href) {
        this.href = href;
    }

    
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    
    public String getType() {
        return type;
    }

   
    public void setType(String type) {
        this.type = type;
    }

    
    public String getUri() {
        return uri;
    }

   
    public void setUri(String uri) {
        this.uri = uri;
    }

}
